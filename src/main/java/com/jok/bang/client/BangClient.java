package com.jok.bang.client;

import com.jok.bang.model.Game;
import com.jok.bang.model.Player;

import java.util.UUID;

public class BangClient {
    private Player player;
    private Game activeGame;

    public Player createPlayer(String name){
        return new Player(name);
    }

    public void joinGame(UUID uuid){

    }

    public void leaveGame(UUID uuid){

    }
}
