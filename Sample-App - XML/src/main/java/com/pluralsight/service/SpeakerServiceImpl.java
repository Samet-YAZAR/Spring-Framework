package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    //Dependency injection HardCoded Style of Maven
    private SpeakerRepository repository;  // = new HibernateSpeakerRepositoryImpl();

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }



}
