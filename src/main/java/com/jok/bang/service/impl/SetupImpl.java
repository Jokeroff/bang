package com.jok.bang.service.impl;

import com.jok.bang.model.Character;
import com.jok.bang.model.Game;
import com.jok.bang.model.Player;
import com.jok.bang.model.Role;
import com.jok.bang.service.ISetup;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class SetupImpl implements ISetup {
    private List<Role> baseRoleList = Arrays.asList(Role.SHERIFF,
                                                    Role.DEPUTY,
                                                    Role.RENEGADE,
                                                    Role.OUTLAW,
                                                    Role.OUTLAW,
                                                    Role.OUTLAW);

    private Set<Character> characterSet = new HashSet<>();

    @Override
    public void initGame(Game game) {
        initGame6Players(game);

    }

    private void initGame6Players(Game game){
        Collections.shuffle(baseRoleList, new Random());
        List<Player> players = game.getPlayers();
        Iterator<Role> iterator = baseRoleList.iterator();

        for(Player player : players){
            while(iterator.hasNext()){
                player.setRole(iterator.next());
                Character character = characterSet.iterator().next();
                player.setCharacter(character);
                int bullets = character.getBullets();
                bullets = player.getRole().equals(Role.SHERIFF) ? bullets + 1 : bullets;
                player.setCurrentBullets(bullets);
                player.setMaxBullets(bullets);
                break;
            }
        }
    }

}
