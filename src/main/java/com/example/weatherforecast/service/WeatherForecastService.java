package com.example.weatherforecast.service;

import com.example.weatherforecast.model.CurrentWeather;

public interface WeatherForecastService {

    CurrentWeather getCurrentWeather(String cityName);
}
