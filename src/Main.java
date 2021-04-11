import MyLinkedList.*;
import seaBattle.Bonus;
import seaBattle.Ship;
import seaBattle.Side;

public class Main {

    public static void main(String[] args) {
        Ship ship = new Ship(Side.ANTON, 3);
        Ship ship2 = new Ship(Side.ENEMY, 2);
        System.out.println(ship.isDead());
        Bonus.BonusesName a = Bonus.BonusesName.FAK;
        Bonus b = new Bonus(a);
    }
}
