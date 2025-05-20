package com.api.Ludaris.controller;

import com.api.Ludaris.entities.Game;
import com.api.Ludaris.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Ludaris/games-api/v1")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> getAll(){
        List<Game> result = gameService.findAll();
        return result;
    }
}
