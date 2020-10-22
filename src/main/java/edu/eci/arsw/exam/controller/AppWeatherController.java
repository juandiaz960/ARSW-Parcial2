package edu.eci.arsw.exam.controller;

import edu.eci.arsw.exam.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weather")
public class AppWeatherController {

    @Autowired
    WeatherService weatherService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getDataByCity(@PathVariable String name) {
        try {
            return new ResponseEntity<>( weatherService.getDataByCity(name), HttpStatus.ACCEPTED);
        } catch (WeatherServiceException e) {
            return new ResponseEntity<>("ERROR 404 NOT FOUND", HttpStatus.NOT_FOUND);
        }
    }

}
