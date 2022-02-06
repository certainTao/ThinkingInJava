package com.hutao.page.page130;
import static com.hutao.util.Print.*;
class Game{
    Game(int i){
        print("Game constructor "+i);
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        print("BoardGame constructor"+i);
    }
}

public class Chess extends BoardGame{
    Chess(){
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
