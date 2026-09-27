public class CardUtilTest {
    public static void main(String[] args) {
        Card hiRank = new Card(Rank.ACE, Suite.SPADES);
        Card normal = new Card(Rank.SIX, Suite.CLUBS);

        System.out.println(CardUtil.isHighestCard(hiRank));
        System.out.println(CardUtil.isHighestCard(normal));
    }
}
