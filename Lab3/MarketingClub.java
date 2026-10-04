public class MarketingClub extends Club {
    private int budget;

    public MarketingClub(String c, int m, int b) {
        super(c, m);
        this.budget = b;
    }

    public boolean useBudget(int amount) {
        if (budget - amount >= 0) {
            this.budget = budget - amount;
            return true;
        }
        return false;
    }

    @Override
    public int determineBudget() {
        if (budget > 1000) {
            return 0;
        } else {
            return super.determineBudget();
        }
    }
}
