public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int total = 0;
        for (int i = 0; i < clubList.length; i++) {
            total = total + clubList[i].determineBudget();
        }
        return total;
    }

    public int getAllMembers() {
        int total = 0;
        for (int i = 0; i < clubList.length; i++) {
            total = total + clubList[i].numMember;
        }
        return total;
    }

    public Club getHighestMemberClub() {
        Club highest = clubList[0];
        for (int i = 1; i < clubList.length; i++) {
            if (clubList[i].numMember > highest.numMember) {
                highest = clubList[i];
            }
        }
        return highest;
    }
}
