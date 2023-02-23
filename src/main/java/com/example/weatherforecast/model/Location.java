package com.example.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

    @JsonProperty("name")
    private String name;

    @JsonProperty("region")
    private String region;

    @JsonProperty("country")
    private String country;

    @JsonProperty("lat")
    private double lat;

    @JsonProperty("lon")
    private double lon;

    @JsonProperty("tz_id")
    private String tzId;

    @JsonProperty("localtime_epoch")
    private int localtimeEpoch;

    @JsonProperty("localtime")
    private String localtime;
}
