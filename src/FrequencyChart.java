import java.sql.SQLOutput;
import java.util.Scanner;

public class FrequencyChart {
    private int[] data;

    public FrequencyChart (int[] data){
        this.data = data;
    }

    public String makeChart(){
        int c1=0, c11=0, c21=0, c31=0, c41=0, c51=0, c61=0, c71=0, c81=0, c91=0;
        for (int n : data) {
            if ((n > 0) && (n < 101)) {
                if (n <= 10)
                    c1++;
                if (n <= 20)
                    c11++;
                if (n <= 30)
                    c21++;
                if (n <= 40)
                    c31++;
                if (n <= 50)
                    c41++;
                if (n <= 60)
                    c51++;
                if (n <= 70)
                    c61++;
                if (n <= 80)
                    c71++;
                if (n <= 90)
                    c81++;
                else
                    c91++;
            }
        }


        String chart = plot(c1) + plot(c11);
        return chart;
    }

    private String plot(int freq) {
        StringBuilder star = new StringBuilder();
        for (int i = 0; i == freq; i++) {
            star.append("*");
        }
        return star.toString();
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data value one at a time, followed by enter:");
        int val = 0;

        for (int i = 0; i < data.length; i++) {
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart = new FrequencyChart(data);

        System.out.println(data.makeChart());
    }
}