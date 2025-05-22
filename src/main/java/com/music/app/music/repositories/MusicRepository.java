package com.music.app.music.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.music.app.music.entities.Music;

public interface MusicRepository extends JpaRepository<Music, Long>{
    
}
