package com.api.Ludaris.service;

import com.api.Ludaris.dto.GameDto;
import com.api.Ludaris.entities.Game;
import com.api.Ludaris.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
