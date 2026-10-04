public class Club {
    // name of the club
    protected String clubName;
    // minimum number of members in the club
    protected int minNumMember;
    // current number of members
    protected int numMember;

    public Club(String clubName, int minimumMembers) {
        this.clubName = clubName;
        minNumMember = minimumMembers;
        numMember = minimumMembers;
    }

    public void addMember(int num) {
        numMember += num;
    }

    public void changeName(String newName) {
        clubName = newName;
    }

    public String getName() {
        return clubName;
    }

    public int determineBudget() {
        return numMember * 1000;
    }

    public void advertise() {
        System.out.println("Please join club: " + clubName);
    }
}
