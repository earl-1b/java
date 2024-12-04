//Llena Earl Laurence
//final challenge no.2

//declaration od scanner
import java.util.Scanner;

public class WeatherTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //declaration of array
        double[][] temperatures = new double[3][7];

         //ask the user to input the temperature
        System.out.println("Enter temperature for 3 cities over 7 days:");

        // Input temperatures
        for (int i = 0; i < 3; i++) {
        System.out.println("City " + (i + 1) + ":");
        for (int j = 0; j < 7; j++) {
        System.out.print("Day " + (j + 1) + ": ");
        temperatures[i][j] = sc.nextDouble();
            }
        }

        // Process and display results
        for (int i = 0; i < 3; i++) {
            double total = 0;
            double highest = temperatures[i][0];

        for (int j = 0; j < 7; j++) {
                total += temperatures[i][j];

        if (temperatures[i][j] > highest) {
        highest = temperatures[i][j];
                }
            }

        double average = total / 7;
        System.out.printf("City %d - Average: %.2f, Highest: %.2f\n", i + 1, average, highest);
        }

        sc.close();
    }
}