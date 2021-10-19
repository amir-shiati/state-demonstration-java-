package core;

public class PlayState implements PlayerState {
    @Override
    public void action(Player player) {
        System.out.println("Player is playing.");
        player.changeState(this);
    }
}
