package Obstacles;

import Players.Player;

public class Water extends Obstacle {
    private final int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Player player) {
        player.swim(distance);
    }
}
