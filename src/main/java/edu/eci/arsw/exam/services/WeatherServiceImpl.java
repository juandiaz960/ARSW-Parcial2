package edu.eci.arsw.exam.services;

import edu.eci.arsw.exam.model.*;
import edu.eci.arsw.exam.web.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    Web web;

    @Override
    public List<CityData> getDataByCity(String name) throws WeatherServiceException {
        List<CityData> res = new ArrayList<>();
        res.add(web.getWeatherByCity(name));
        return res;
    }
}
