import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        for (String rank : Card.RANK) {
            for (String suit: Card.SUIT) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void shuffleDeck() {
        int rand;
        for(int i = 0; i < 52; i++){
            rand = (int) (Math.random() * 51);
            deck.set(rand, deck.set(i, deck.get(rand)));
        }
    }

    public String toString() {
        return "" + this.getDeck();
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d.getDeck());
        d.shuffleDeck();
        System.out.println(d.getDeck());
    }












}
