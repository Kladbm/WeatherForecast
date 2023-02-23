package com.example.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {

    @JsonProperty("last_updated")
    private String lastUpdated;

    @JsonProperty("last_updated_epoch")
    private int lastUpdatedEpoch;

    @JsonProperty("temp_c")
    private double tempC;

    @JsonProperty("temp_f")
    private double tempF;

    @JsonProperty("is_day")
    private int isDay;

    @JsonProperty("condition")
    private Condition condition;

    @JsonProperty("wind_mph")
    private double windMph;

    @JsonProperty("wind_kph")
    private double windKph;

    @JsonProperty("wind_degree")
    private int windDegree;

    @JsonProperty("wind_dir")
    private String windDir;

    @JsonProperty("pressure_mb")
    private double pressureMb;

    @JsonProperty("pressure_in")
    private double pressureIn;

    @JsonProperty("precip_mm")
    private double precipMm;

    @JsonProperty("precip_in")
    private double precipIn;

    @JsonProperty("humidity")
    private int humidity;

    @JsonProperty("cloud")
    private int cloud;

    @JsonProperty("feelslike_c")
    private double feelslikeC;

    @JsonProperty("feelslike_f")
    private double feelslikeF;

    @JsonProperty("vis_km")
    private double visKm;

    @JsonProperty("vis_miles")
    private double visMiles;

    @JsonProperty("uv")
    private double uv;

    @JsonProperty("gust_mph")
    private double gustMph;

    @JsonProperty("gust_kph")
    private double gustKph;
}
