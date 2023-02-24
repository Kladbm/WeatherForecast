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
    public List<Requests> getAllRequests() {
        return requestsService.getAllRequests();
    }

    @GetMapping("/requests/{id}")
    public Requests getRequests(@PathVariable int id) {
        return requestsService.getRequests(id);
    }

    @PostMapping("/requests")
    public Requests addRequests(@RequestBody Requests requests) {
        requestsService.saveRequests(requests);
        return requests;
    }

    @PutMapping("/requests")
    public Requests updateRequests(@RequestBody Requests requests) {
        requestsService.saveRequests(requests);
        return requests;
    }

    @DeleteMapping("/requests/{id}")
    public String deleteRequests(@PathVariable int id) {
        requestsService.deleteRequests(id);
        return "Request with ID: " + id + " was deleted";
    }
}
