package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    //Dependency injection HardCoded Style of Maven
    //private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    //to use our service we make DI to have access to the repo.
    //but with spring no longer we need to do it.

    private SpeakerRepository repository;

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
