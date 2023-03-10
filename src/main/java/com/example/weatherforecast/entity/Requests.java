package com.example.weatherforecast.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "request_name")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Requests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "current_weather_id")
    private CurrentWeather currentWeather;

    @Column(name = "time")
    private String time;
}
