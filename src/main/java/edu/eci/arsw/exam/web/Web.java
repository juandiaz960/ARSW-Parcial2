package edu.eci.arsw.exam.web;

import edu.eci.arsw.exam.model.*;
import edu.eci.arsw.exam.services.*;
import org.springframework.stereotype.Service;

@Service("web")
public interface Web {

    CityData getWeatherByCity(String city) throws WeatherServiceException;
}
