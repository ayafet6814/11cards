//Aaron Yafet
public class Card
{
    Object rank;
    Object suit;
    int pointValue;

    public Card(Object rank, Object suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public boolean equals(Card otherCard)
    {
        if (pointValue == otherCard.pointValue)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return rank + " of " + suit + ", " + pointValue;
    }
}