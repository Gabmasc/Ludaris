package com.api.Ludaris.controller;

import com.api.Ludaris.dto.GameDTOP;
import com.api.Ludaris.dto.GameDto;
import com.api.Ludaris.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Ludaris/games-api/v1")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDto> getAll(){
        List<GameDto> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTOP getById(@PathVariable Long id){
        GameDTOP dtop = gameService.findById(id);
        return dtop;
    }
}
