public class FootballPlayer extends Player {
    public FootballPlayer(String n, int j) {
        super(n, j);
    }

    public void playGame() {
        this.minutesPlayed += 90;
    }
}
