package edu.eci.arsw.exam.web;

import com.squareup.okhttp.OkHttpClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.stereotype.Service;
import java.io.IOException;
import edu.eci.arsw.exam.model.*;
import edu.eci.arsw.exam.services.*;

@Service
public class WebImpl implements Web {

    @Override
    public CityData getWeatherByCity(String city) throws WeatherServiceException {
        {
            Request request = new Request.Builder()
                    .url("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=3d37c5b8413cc80316cec98c3fe48437")
                    .get()
                    .build();
            OkHttpClient client = new OkHttpClient();
            String api = null;
            Response res = null;

            try {
                res = client.newCall(request).execute();
                if (res.isSuccessful()) {
                    api = res.body().string();
                }
            } catch (IOException e) {
                throw new WeatherServiceException("Error: Service not Found");
            }
            Gson gson = new Gson();
            CityData stats = new CityData();
            stats = gson.fromJson(api, CityData.class);
            return stats;
        }
    }
}
