package seaBattle;

public class Bonus implements Placeable {
    public enum BonusesName{
        FAK,SHOOT3X;
    }

    private BonusesName name;

    public Bonus(BonusesName name) {
        this.name = name;
    }
}
