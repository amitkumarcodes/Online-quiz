package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Results;
import com.repositories.ResultRepository;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public Results saveResult(Results result) {
        return resultRepository.save(result);
    }

    public Results getResultById(Long id) {
        return resultRepository.findById(id).orElseThrow(() -> new RuntimeException("Result not found"));
    }
}
