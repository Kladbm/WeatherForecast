package com.example.weatherforecast.controller;

import com.example.weatherforecast.entity.Requests;
import com.example.weatherforecast.service.RequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequestsController {

    @Autowired
    private RequestsService requestsService;

    @GetMapping("/requests")
    public List<Requests> getAllShards() {
        return requestsService.getAllShards();
    }

    @GetMapping("/requests/{id}")
    public Requests getShard(@PathVariable int id) {
        return requestsService.getShard(id);
    }

    @PostMapping("/requests")
    public Requests addShard(@RequestBody Requests requests) {
        requestsService.saveShard(requests);
        return requests;
    }

    @PutMapping("/requests")
    public Requests updateShard(@RequestBody Requests requests) {
        requestsService.saveShard(requests);
        return requests;
    }

    @DeleteMapping("/requests/{id}")
    public String deleteShard(@PathVariable int id) {
        requestsService.deleteShard(id);
        return "Request with ID: " + id + " was deleted";
    }
}
