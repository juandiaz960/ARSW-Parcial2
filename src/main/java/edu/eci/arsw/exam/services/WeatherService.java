package edu.eci.arsw.exam.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.exam.model.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service("Service")
public interface WeatherService {

    List<CityData> getDataByCity(String name) throws WeatherServiceException;

}
