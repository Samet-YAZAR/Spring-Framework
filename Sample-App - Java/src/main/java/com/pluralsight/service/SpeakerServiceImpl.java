package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    //Dependency injection HardCoded Style of Maven
    //private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    //to use our service we make DI to have access to the repo.
    //but with spring no longer we need to do it.

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no arg constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

     // bununla aslida injection saglanmis oldu. kaldirinca setter injectiona donmek lazim.
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter constructor");
        this.repository = repository;
    }
}
/*AppConfig icerisinde sadece SpakerServiceImpl i constructor olarak cagirmis olduk, @Autowired olmasa
bos contructor cagiracak, Repo ya ulasamayacakti.

* */