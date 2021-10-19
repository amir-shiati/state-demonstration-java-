package core;

public class StopState implements PlayerState {
    @Override
    public void action(Player player) {
        System.out.println("Player is stopped.");
        player.changeState(this);
    }
}
