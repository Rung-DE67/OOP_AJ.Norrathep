public class ESportsClubTest {
    public static void main(String[] args) {
        System.out.println("=== Testing ESportsClub e ===");
        ESportsClub e = new ESportsClub("Esport", 100);
        
        System.out.println("clubName: " + e.getName());
        System.out.println("numMember: " + e.getNumMember());
        System.out.println("minNumMember: " + e.minNumMember);
        
        e.advertise();
        System.out.println("Budget: " + e.determineBudget());
        System.out.println("Name: " + e.getName());

        System.out.println();

        System.out.println("=== Testing Club c ===");
        Club c = new ESportsClub("Esport", 100);
        
        System.out.println("clubName: " + c.clubName);
        System.out.println("numMember: " + c.numMember);
        System.out.println("minNumMember: " + c.minNumMember);
        
        c.advertise();
        System.out.println("Budget: " + c.determineBudget());
        System.out.println("Name: " + c.getName());
    }
}
