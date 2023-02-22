package com.example.weatherforecast.service;

import com.example.weatherforecast.entity.Requests;
import com.example.weatherforecast.repository.RequestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestsServiceImpl implements RequestsService {

    @Autowired
    private RequestsRepository requestsRepository;

    @Override
    public List<Requests> getAllShards() {
        return requestsRepository.findAll();
    }

    @Override
    public void saveShard(Requests requests) {
        requestsRepository.save(requests);
    }

    @Override
    public Requests getShard(int id) {
        Requests requests = null;

        Optional<Requests> optional = requestsRepository.findById(id);
        if (optional.isPresent()) {
            requests = optional.get();
        }

        return requests;
    }

    @Override
    public void deleteShard(int id) {
        requestsRepository.deleteById(id);
    }
}
