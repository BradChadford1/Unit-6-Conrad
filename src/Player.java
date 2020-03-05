import java.util.ArrayList;

public class Player {
    private String name;
    public ArrayList<Card> hand;
    private Deck deck;
    private Card casualty;

    public Player(String name, Deck deck, int cut) {
        this.name = name;
        hand = new ArrayList<>();
        casualty = new Card(null, null);
        this.deck = deck;
        deck.shuffleDeck();
        if(cut == 1)
            dealCut1();
        if(cut == 2)
            dealCut2();
    }

    public void dealCut1() {
        for(int i = 0; i < 26; i++)
            hand.add(deck.getDeck().get(i));
    }

    public void dealCut2() {
        for(int i = 26; i < 52; i++)
            hand.add(deck.getDeck().get(i));
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Card getCasualty() {
        return casualty;
    }
    public Card draw() {
        casualty = hand.set(0, hand.get(1));
        hand.remove(0);
        return casualty;
    }

    public int War() {
        int sum  = hand.get(0).getRankValue() + hand.get(1).getRankValue() + hand.get(3).getRankValue();
        return sum;
    }

    public void addToHand(Card card) {
        hand.add(card);
    }









}
