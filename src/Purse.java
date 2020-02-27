import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<Coin>();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double total = 0;
        for (int i = 0; i < coins.size(); i++) {
            total += coins.get(i).getValue();
        }
        return total;
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        int count = 0;
        for (Coin coin : coins) {
            if(coin.equals(aCoin)){
                count++;
            }
        }
        return count;
    }

    public String findSmallest() {
        double smallest = coins.get(0).getValue();
        Coin small = coins.get(0);
        for (int i = 0; i < coins.size(); i++) {
            if(coins.get(i).getValue() < smallest) {
                smallest = coins.get(i).getValue();
                small = coins.get(i);
            }
        }
        return small.getName();
    }

// returns the name of the Coin in the Purse that has the smallest value
}


