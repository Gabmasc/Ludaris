package com.api.Ludaris.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id;

    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game,GameList gameList, Integer position) {
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
