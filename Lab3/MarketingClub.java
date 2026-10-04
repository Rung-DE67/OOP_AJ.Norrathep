public class MarketingClub extends Club {
    private int budget;

    public MarketingClub(String clubName, int minimumMembers, int budget) {
        super(clubName, minimumMembers);
        this.budget = budget;
    }

    public boolean useBudget(int amount) {
        if (amount < 0 || amount > budget) {
            return false;
        }

        budget -= amount;
        return true;
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
