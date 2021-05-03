package seaBattle;

public class Bonus implements Placeable {
    public enum BonusesName{
        FAK,SHOOT3X;
    }

    private BonusesName name;

    public Bonus(BonusesName name) {
        this.name = name;
    }

    public BonusesName getName() {
        return name;
    }

    public void setName(BonusesName name) {
        this.name = name;
    }
}
