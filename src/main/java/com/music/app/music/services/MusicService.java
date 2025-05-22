package com.music.app.music.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.app.music.entities.Music;
import com.music.app.music.repositories.MusicRepository;

@Service
public class MusicService {

    @Autowired
    private MusicRepository repository;

    public List<Music> getAll(){
        return repository.findAll();
    }
    
    public Music save(Music music){
        return repository.save(music);
    }
    
}
