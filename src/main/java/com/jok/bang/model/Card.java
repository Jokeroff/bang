package com.jok.bang.model;

public class Card {
    private CardValue cardValue;
    private Suit suit;
    private CardType cardType;

    private enum CardValue {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }
    private enum Suit {
        HEART,
        DIAMOND,
        SPADE,
        CLUB
    }


}
