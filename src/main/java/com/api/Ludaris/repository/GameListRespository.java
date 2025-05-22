package com.api.Ludaris.repository;

import com.api.Ludaris.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRespository extends JpaRepository<GameList, Long> {
}
