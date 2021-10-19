package client;

import core.PlayState;
import core.Player;
import core.StopState;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println(player.getState().toString());

        PlayState play = new PlayState();
        play.action(player);
        System.out.println(player.getState().toString());

        StopState stop = new StopState();
        stop.action(player);
        System.out.println(player.getState().toString());
    }
}
