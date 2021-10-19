package core;

public class IdleState implements PlayerState {
    @Override
    public void action(Player player) {
        System.out.println("Player is idle.");
        player.changeState(this);
    }

    @Override
    public String toString(){
        return "idle";
    }
}
