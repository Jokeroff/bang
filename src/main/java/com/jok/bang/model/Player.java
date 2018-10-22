package com.jok.bang.model;

import java.util.List;

public class Player {
    private Role role;
    private Character character;
    private int maxBullets;
    private int currentBullets;
    private String name;
    private Gun gun = new Colt();
    private List<Card> cards;
    private List<Card> activeCards;
    private boolean alive = true;


    public Player(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public void setMaxBullets(int maxBullets) {
        this.maxBullets = maxBullets;
    }

    public int getCurrentBullets() {
        return currentBullets;
    }

    public void setCurrentBullets(int currentBullets) {
        this.currentBullets = currentBullets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getActiveCards() {
        return activeCards;
    }

    public void setActiveCards(List<Card> activeCards) {
        this.activeCards = activeCards;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
