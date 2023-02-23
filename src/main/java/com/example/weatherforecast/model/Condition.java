package com.example.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Condition {

    @JsonProperty("text")
    private String text;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("code")
    private int code;
}
