public class Player {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

    public Player(String n, int j) {
        this.name = n;
        this.jerseyNumber = j;
        this.minutesPlayed = 0;
    }

    public void print() {
        System.out.println(name + " : " + jerseyNumber);
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }
}
