package com.example.weatherforecast.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "current")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Current {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "last_updated")
    private String lastUpdated;

    @Column(name = "last_updated_epoch")
    private int lastUpdatedEpoch;

    @Column(name = "temp_c")
    private double tempC;

    @Column(name = "temp_f")
    private double tempF;

    @Column(name = "is_day")
    private int isDay;

    @Column(name = "wind_mph")
    private double windMph;

    @Column(name = "wind_kph")
    private double windKph;

    @Column(name = "wind_degree")
    private int windDegree;

    @Column(name = "wind_dir")
    private String windDir;

    @Column(name = "pressure_mb")
    private double pressureMb;

    @Column(name = "pressure_in")
    private double pressureIn;

    @Column(name = "precip_mm")
    private double precipMm;

    @Column(name = "precip_in")
    private double precipIn;

    @Column(name = "humidity")
    private int humidity;

    @Column(name = "cloud")
    private int cloud;

    @Column(name = "feelslike_c")
    private double feelslikeC;

    @Column(name = "feelslike_f")
    private double feelslikeF;

    @Column(name = "vis_km")
    private double visKm;

    @Column(name = "vis_miles")
    private double visMiles;

    @Column(name = "uv")
    private double uv;

    @Column(name = "gust_mph")
    private double gustMph;

    @Column(name = "gust_kph")
    private double gustKph;
}
