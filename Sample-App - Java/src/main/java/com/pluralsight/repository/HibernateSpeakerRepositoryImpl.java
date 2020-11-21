package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstname("Samet");
        speaker.setLastname("YAZAR");

        speakers.add(speaker);

        return speakers;
    }
}
