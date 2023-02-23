package com.example.weatherforecast.service;

import com.example.weatherforecast.model.CurrentWeather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService {

    RestTemplate restTemplate = new RestTemplate();

    @Value("${APIkey}")
    String APIkey;

    @Override
    public CurrentWeather getCurrentWeather(String cityName) {
        String url = "http://api.weatherapi.com/v1/current.json?key=" + APIkey + "&q=" + cityName;
        return restTemplate.getForEntity(url, CurrentWeather.class).getBody();
    }
}
