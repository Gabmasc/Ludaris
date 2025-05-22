package com.api.Ludaris.service;

import com.api.Ludaris.dto.GameListDTO;
import com.api.Ludaris.entities.GameList;
import com.api.Ludaris.repository.GameListRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRespository gameListRespository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRespository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
