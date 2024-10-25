import java.util.Arrays;
import java.util.Scanner;

public class th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }


        Arrays.sort(scores);
        double a=scores[0];
        double b=scores[n-1];
        double sum = 0;
        int dem=0;
        for (int i = 0; i < n; i++) {
            if(scores[i]!=a&&scores[i]!=b){
                sum += scores[i];
                dem++;
        }}

        double average = sum / (dem);
        System.out.printf("%.2f\n", average);

    }
}
