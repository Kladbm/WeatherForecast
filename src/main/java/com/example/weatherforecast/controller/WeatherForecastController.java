package com.example.weatherforecast.controller;

import com.example.weatherforecast.model.CurrentWeather;
import com.example.weatherforecast.service.WeatherForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WeatherForecastController {

    @Autowired
    WeatherForecastService weatherForecastService;

    @GetMapping(path = "/current/{city_name}")
    public CurrentWeather getCurrentWeather(@PathVariable(name = "city_name") String cityName) {
        return weatherForecastService.getCurrentWeather(cityName);
    }
}
