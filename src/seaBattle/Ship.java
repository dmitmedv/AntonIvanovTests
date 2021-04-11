package seaBattle;

public class Ship implements Placeable {
    private int health;
    private Side side;

    public Ship(Side side, int health) {
        this.side = side;
        this.health = health;
    }
    public boolean isDead() {
        return health == 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
