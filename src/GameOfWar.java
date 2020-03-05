public class GameOfWar {

    public static int compareCards(Card card1, Card card2){
        int compare = 0;
        if (card1.getRankValue() < card2.getRankValue())
            compare = -1;
        if (card1.getRankValue() == card2.getRankValue())
            compare = 0;
        if (card1.getRankValue() > card2.getRankValue())
            compare = 1;

        return compare;
    }
        public static void goToWar(Player player1, Player player2){
            Card card1 = player1.draw();
            Card card2 = player2.draw();
        if (compareCards(card1, card2) == -1 ){
                player2.addToHand(player1.getCasualty());
        }
        if (compareCards(card1, card2) == 0){

        }



        }
    
    
    
    public static void main(String[] args) {

        Deck deck = new Deck();
        Player p1 = new Player("Conrad", deck, 1);
        Player p2 = new Player("Andrew", deck, 2);

        System.out.println(p1.getHand());
        System.out.println(p2.getHand());
        System.out.println(compareCards(p1.draw(), p2.draw()));
        System.out.println();
    }
}
