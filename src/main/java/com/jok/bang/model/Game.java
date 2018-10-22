package com.jok.bang.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

public class Game {
    private UUID uuid = UUID.randomUUID();
    private List<Player> players = new LinkedList<>();
    private List<Card> drawPile;
    private Queue<Card> discardPile;


    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Card> getDrawPile() {
        return drawPile;
    }

    public void setDrawPile(List<Card> drawPile) {
        this.drawPile = drawPile;
    }

    public Queue<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(Queue<Card> discardPile) {
        this.discardPile = discardPile;
    }
}
