package OOP.enums;

public enum Grades {
    SHKELQYESHEM(5),
    SHUME_MIRE(4),
    MIRE(3),
    MJAFTUESHEM(2),
    DOBET(1);

    private int notat;

    private Grades (int notat) {
        this.notat=notat;
    }

    public int getNotat() {
        return notat;
    }
    public void print() {
        System.out.printf("%s - %s %n", this, notat);
    }
}
