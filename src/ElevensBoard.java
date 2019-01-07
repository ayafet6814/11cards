//Aaron Yafet
public class ElevensBoard
{

    Object[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
    Object[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Jack", "Queen", "King", "Ace"};
    int pointValue = 0;

    int[] size9;

    public ElevensBoard(int[] boardSize)
    {
        this.size9 = boardSize;
    }

    public void check2(Card oCard, Card pCard)
    {
        int rRank1 = (int) (Math.random() * 13);
        int rSuit1 = (int) (Math.random() * 3);
        int rRank2 = (int) (Math.random() * 13);
        int rSuit2 = (int) (Math.random() * 3);

        oCard = new Card(ranks[rRank1], suits[rSuit1], pointValue);
        pCard = new Card(ranks[rRank2], suits[rSuit2], pointValue);

        System.out.println(oCard);
        System.out.println(pCard);
    }

    public boolean check11(Card oCard, Card pCard)
    {
        int i; int j;
        if ((oCard.rank[i] + pCard.rank[j] == 11))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}