public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int total = 0;
        for (Club club : clubList) {
            total += club.determineBudget();
        }
        return total;
    }

    public int getAllMembers() {
        int total = 0;
        for (Club club : clubList) {
            total += club.numMember;
        }
        return total;
    }

    public Club getHighestMemberClub() {
        if (clubList.length == 0) {
            return null;
        }

        Club highest = clubList[0];
        for (int i = 1; i < clubList.length; i++) {
            Club club = clubList[i];
            if (club.numMember > highest.numMember) {
                highest = club;
            }
        }
        return highest;
    }
}
