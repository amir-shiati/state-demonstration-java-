package core;

public class Player {
    PlayerState state;

    public Player() {
        state = new IdleState();
    }

    public void changeState(PlayerState state) {
        this.state = state;
    }

    public PlayerState getState() {
        return state;
    }
}
