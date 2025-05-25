package com.api.Ludaris.controller;

import com.api.Ludaris.dto.GameDto;
import com.api.Ludaris.dto.GameListDTO;
import com.api.Ludaris.dto.ReplacementDTO;
import com.api.Ludaris.service.GameListService;
import com.api.Ludaris.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> getAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameDto> getByList(@PathVariable Long listId){
        List<GameDto> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
