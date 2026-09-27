public class ClubTest {
    public static void main(String[] args) {
        
        System.out.println("--- Testing SportsClub ---");
        SportsClub sport = new SportsClub("Football Club", 10);
        sport.addMember(15); 
        
        System.out.println("Name: " + sport.getName());
        System.out.println("Budget: " + sport.determineBudget());
        
        sport.changeName("Basketball Club");
        System.out.println("Name after change: " + sport.getName());

        System.out.println("--- Testing MarketingClub ---");
        MarketingClub market = new MarketingClub("Startup Club", 10, 1500);
        
        System.out.println("Budget (budget > 1000): " + market.determineBudget());
        
        boolean status1 = market.useBudget(600);
        System.out.println("Use budget 600: " + status1);
        
        System.out.println("Budget (budget <= 1000): " + market.determineBudget());
        
        boolean status2 = market.useBudget(1000);
        System.out.println("Use budget 1000: " + status2);
    }
}