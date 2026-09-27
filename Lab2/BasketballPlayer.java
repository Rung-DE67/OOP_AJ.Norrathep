public class BasketballPlayer extends Player {
    public BasketballPlayer(String n, int j) {
        super(n, j);
    }

    public void playGame() {
        this.minutesPlayed += 48;
    }

    public void changeJerseyNumber(int newNumber) {
        this.jerseyNumber = newNumber;
        System.out.println(name + " changes number to " + jerseyNumber);
    }
}
