package com.example.weatherforecast.service;

import com.example.weatherforecast.entity.Requests;

import java.util.List;

public interface RequestsService {

    List<Requests> getAllRequests();

    void saveRequests(Requests requests);

    Requests getRequests(int id);

    void deleteRequests(int id);
}
