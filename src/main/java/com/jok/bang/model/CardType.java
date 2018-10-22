package com.jok.bang.model;

public enum CardType {
    BANG("BANG", 99, CardClass.PASSIVE),
    MISSED("MISSED", 99, CardClass.PASSIVE),
    BEER("BEER", 1, CardClass.PASSIVE),
    SALOON("SALOON", 99, CardClass.PASSIVE),
    CAT_BALOU("CAT_BALOU", 99, CardClass.PASSIVE),
    PANIC("PANIC", 1, CardClass.PASSIVE),
    GATLING("GATLING", 99, CardClass.PASSIVE),
    INDIANS("INDIANS", 99, CardClass.PASSIVE),
    DUEL("DUEL", 99, CardClass.PASSIVE),
    JAIL("JAIL", 99, CardClass.PASSIVE),
    STORE("STORE", 99, CardClass.PASSIVE),
    STAGECOACH("STAGECOACH", 99, CardClass.PASSIVE),
    WELLS_FARGO("WELLS_FARGO", 99, CardClass.PASSIVE),
    DYNAMITE("DYNAMITE", 1, CardClass.PASSIVE),

    BARREL("BARREL", 1, CardClass.ACTIVE),
    MUSTANG("MUSTANG", 1, CardClass.ACTIVE),
    SCOPE("SCOPE", 1, CardClass.ACTIVE),

    VOLCANIC("VOLCANIC", 1, CardClass.ACTIVE),
    SCHOFIELD("SCHOFIELD", 2, CardClass.ACTIVE),
    REMINGTON("REMINGTON", 3, CardClass.ACTIVE),
    CARBINE("CARBINE", 4, CardClass.ACTIVE),
    WINCHESTER("WINCHESTER", 5, CardClass.ACTIVE)

    ;
    private enum CardClass{
        ACTIVE,
        PASSIVE
    }

    private String name;
    private int distance;
    private CardClass cardClass;

    CardType(String name, int distance, CardClass cardClass) {
        this.name = name;
        this.distance = distance;
        this.cardClass = cardClass;
    }

    public  static CardType getCardType(String name){
        for(CardType cardType : CardType.values()){
            if(cardType.name.equalsIgnoreCase(name)){
                return cardType;
            }
        }
        throw new IllegalArgumentException("CardType doesn't exists: " + name);
    }

}
