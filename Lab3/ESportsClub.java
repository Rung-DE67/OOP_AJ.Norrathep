public final class ESportsClub extends SportsClub {
    public ESportsClub(String clubName, int minimumMembers) {
        super(clubName, minimumMembers);
        this.minNumMember = 1;
    }

    @Override
    public final void advertise() {
        System.out.println("No need to advertise");
    }
}
