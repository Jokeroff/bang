package com.jok.bang.server;

import com.jok.bang.model.Game;
import com.jok.bang.model.Player;
import com.jok.bang.service.ISetup;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BangServer {
    private Map<UUID, Game> activeGames = new HashMap<>();
    private final static int PLAYERS_MIN = 6;
    private final static int PLAYERS_MAX = 6;

    @Autowired
    private ISetup iSetup;

    public UUID createGame() {
        Game game = new Game();
        UUID uuid = game.getUuid();
        activeGames.put(uuid, game);
        return uuid;
    }

    public int addPlayer(UUID uuid, Player player) {
        if (activeGames.keySet().contains(uuid)) {
            if(!isMaxPlayers(uuid)) {
                Game game = activeGames.get(uuid);
                List<Player> players = game.getPlayers();
                if (!players.contains(player)) {
                    players.add(player);
                }
                throw new RuntimeException("Player " + player + " already joined game with UUID " + uuid);
            }
            throw new RuntimeException("Game has maximum number of players ( : " + uuid);
        }
        throw new IllegalArgumentException("Game doesn't exist with UUID " + uuid);
    }

    public void startGame(UUID uuid) {
        if(isEnoughPlayers(uuid)){
            iSetup.initGame(activeGames.get(uuid));
        }

    }

    private boolean isEnoughPlayers(UUID uuid){
        return activeGames.get(uuid).getPlayers().size() == PLAYERS_MIN;
    }

    private boolean isMaxPlayers(UUID uuid){
        return activeGames.get(uuid).getPlayers().size() == PLAYERS_MAX;
    }
}
