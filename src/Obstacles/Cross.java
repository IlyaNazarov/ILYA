package Obstacles;

import Players.Player;

public class Cross extends Obstacle {
    private final int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Player player) {
        player.run(distance);
    }
}
