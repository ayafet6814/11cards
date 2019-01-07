//Aaron Yafet
public class Runner
{

    //Challenge One
    public static void main(String[] args)
    {

        Object[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        Object[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Jack", "Queen", "King", "Ace"};
        int pointValue = 0;

        //Hearts
        for (int h = 0; h < 13; h++)
        {
            pointValue++;
            Card hCard = new Card(ranks[h], suits[0], pointValue);
            System.out.println(hCard);
        }

        //Spades
        for (int s = 0; s < 13; s++)
        {
            pointValue++;
            Card hCard = new Card(ranks[s], suits[1], pointValue);
            System.out.println(hCard);
        }

        //Clubs
        for (int c = 0; c < 13; c++)
        {
            pointValue++;
            Card hCard = new Card(ranks[c], suits[2], pointValue);
            System.out.println(hCard);
        }

        //Diamonds
        for (int d = 0; d < 13; d++)
        {
            pointValue++;
            Card hCard = new Card(ranks[d], suits[3], pointValue);
            System.out.println(hCard);
        }



    }

}