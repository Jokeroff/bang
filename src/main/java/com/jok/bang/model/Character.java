package com.jok.bang.model;

public enum Character {
    BART_CASSIDY("BART_CASSIDY", 4),
   /* each time he loses a life point, he immediately draws a card from the deck.*/
    BLACK_JACK("BLACK_JACK", 4),
    /*during phase 1 of his turn,he must show the second card he draws: if it’s Heart or Diamonds (just like a “draw!”),
    he draws one additional  card (without revealing it)*/
    CALAMITY_JANET("CALAMITY_JANET", 4),
    /*she can use BANG! cards as Missed! cards and vice versa. If she plays a Missed! as  a BANG!, she cannot play another
    BANG! card that turn (unless she has a Volcanic in play)*/
    EL_GRINGO("EL_GRINGO", 3 ),
    /*each time he loses a life point due to a card played by another player, he draws a random card
    from the hands of that player (one card for each life point). If that player has no more cards, too bad!,
     he does not draw. Note that Dynamite damages are not caused by any player"
    JESSE_JONES("JESSE_JONES", 4),
    /*during phase 1 of his turn, he may choose to draw the first card from the deck, or randomly  from the hand of any other player.
    Then he draws the second card from the deck*/
    JOURDONNAIS("JOURDONNAIS", 4),
    /*he is considered to have a Barrel in play at all times; he can “draw!” when he is the target of a BANG!, and
    on a Heart he is missed. If he has another real Barrel card in play, he can count both of them, giving him
    two chances to cancel the BANG! before playing a Missed!*/
    KIT_CARLSON("KIT_CARLSON", 4);

    private String name;
    private int bullets;

    Character(String name, int bullets) {
        this.name = name;
        this.bullets = bullets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    /*during phase 1 of his turn, he looks at the top
    three cards of the deck:
    he chooses 2 to draw, and
    puts the other one back on the top of
    the deck, face down.
            Lucky Duke (4 life points):
    each time he is required
    to “draw!”, he flips the
    top two cards from the
    deck, and chooses the
    result he prefers. Discard both cards
    afterwards.
            Paul Regret (3 life points):
    he is considered to have
    a Mustang in play at all
    times; all other players
    must add 1 to the distance
    to him. If he has another real
    Mustang in play, he can count both
    of them, increasing all distances to
    him by a total of 2.
    Pedro Ramirez (4 life
            points): during phase 1 of
    his turn, he may choose
    to draw the first card from
    the top of the discard pile
    or from the deck. Then, he draws the
    second card from the deck.
            Rose Doolan (4 life
            points): she is considered
    to have a Scope in play
    at all times; she sees
    the other players at a
    distance decreased by 1. If she has
    another real Scope in play, she can
    count both of them, reducing her
    distance to all other players by a
    total of 2.
    Sid Ketchum (4 life
            points): at any time, he
    may discard 2 cards from
    his hand to regain one life
    point. If he is willing and
    able, he can use this ability more
    than once at a time. But remember:
    you cannot have more life points
    than your starting amount!
    Bang-ENG.indd 10 04/11/2008 15.28.07
            11
    Curiosity
    In order to keep track of your life points, you can use
    another character card, from the ones left over. Turn it
    face down and cover / uncover the bullets by sliding your
    character card on it, just like in the picture. This makes
    easier to bring BANG! with you and play it anywhere!
    Jesse Jones with three life points
    Slab the Killer (4 life
            points): players trying to
    cancel his BANG! cards
    need to play 2 Missed!. The
    Barrel effect, if successfully
    used, only counts as one Missed!.
    Suzy Lafayette (4 life
            points): as soon as she
    has no cards in her hand,
    she draws a card from the
    draw pile.
    Vulture Sam (4 life points):
    whenever a character is
    eliminated from the game,
    Sam takes all the cards
    that player had in his
    hand and in play, and adds them to
    his hand.
    Willy the Kid (4 life
            points): he can play any
    number of BANG! cards
    during his turn*/
    }
