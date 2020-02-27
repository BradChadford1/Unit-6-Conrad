import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListWorker {
    public static void removeZeros(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            if(list.get(i) == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    public static int countLetters(ArrayList<String> list) {
        int numChar = 0;
        for (int i = 0; i < list.size(); i++){
            numChar += list.get(i).length();
        }
        return numChar;
    }

    public static int findPosition(int keyValue, ArrayList<Integer> list){
        int index = -1;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == keyValue)
                index = i;
        }
        return index;
    }

    public static ArrayList<String> parseIntoArrayList(String string) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < string.length(); i++) {
            list.add(string.substring(i, i + 1));
        }
        return list;
    }

    public static String findMin(ArrayList<Person> list) {
        Person minPerson = list.get(0);
        int minAge = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < minAge) {
                minAge = list.get(i).getAge();
                minPerson = list.get(i);
            }
        }
        return minPerson.getName();
    }





    public static void main(String[] args) {
        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Starting List: " + nums);
        ArrayListWorker.removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n  Actual: " + nums);

        System.out.println();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n  Actual: " + countLetters(words));

        System.out.println();

        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n  Actual: " + findPosition(1, nums));

        System.out.println();

        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t,  , L, i, n, n] \n  Actual: " + parseIntoArrayList("West Linn"));

        System.out.println();

        System.out.println("Test FindMin for Person objects");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person("Abe", 32),
                new Person("Betty",14), new Person("Cris", 18)));
        System.out.println(people);
        System.out.println("Expected: Betty \n  Actual: " + findMin(people));

        System.out.println();

        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters  = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Smallest Coin  = " + myPurse.findSmallest());
        System.out.println("Total of Purse = $" + myPurse.getTotal());
    }




}
