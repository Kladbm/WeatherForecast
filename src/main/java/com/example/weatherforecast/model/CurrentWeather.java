package com.example.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrentWeather {

    @JsonProperty("location")
    private Location location;

    @JsonProperty("current")
    private Current current;
}
