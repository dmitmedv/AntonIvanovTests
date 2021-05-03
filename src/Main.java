import MyLinkedList.*;
import seaBattle.Bonus;
import seaBattle.Placeable;
import seaBattle.Ship;
import seaBattle.Side;
import seaBattle.Map;

public class Main {

    public static void main(String[] args) {
        Ship ship = new Ship(Side.ANTON, 3);
        Ship ship2 = new Ship(Side.ENEMY, 2);
        System.out.println(ship.isDead());
        Bonus.BonusesName a = Bonus.BonusesName.FAK;
        Bonus b = new Bonus(a);

        Placeable p1 = ship;
        Placeable p2 = b;

        //
        if (p1 instanceof Ship) {
            System.out.println("ship");
            ((Ship) p1).isDead();
        } else if (p1 instanceof Bonus) {
            System.out.println("bonus");
        } else System.out.println("null");

        Map map = new Map();
        System.out.println(Map.N);
        System.out.println(map.N);

    }
}
