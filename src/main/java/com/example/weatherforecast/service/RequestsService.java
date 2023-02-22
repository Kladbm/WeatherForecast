package com.example.weatherforecast.service;

import com.example.weatherforecast.entity.Requests;

import java.util.List;

public interface RequestsService {

    List<Requests> getAllShards();

    void saveShard(Requests requests);

    Requests getShard(int id);

    void deleteShard(int id);
}
