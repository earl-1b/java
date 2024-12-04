//Llena, Earl laurence A.
//Final challenge No.1


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] price = new int[10];
        int[]quantity = new int[10];
        
        // Prompt the user to input price and quantity for each stock item
        for (int ctr = 0; ctr < 10; ctr++) {
            System.out.print("Enter Stock Level [" + (ctr+1) + "]: ");
            price[ctr] = input.nextInt();
            //tell the user to input a stock quantity
            System.out.print("Enter Stock Quantity [" + (ctr+1) + "]: ");
            quantity[ctr] = input.nextInt();
        }
        // Calculate and display the total value for each stock item
        for (int ctr = 0; ctr < 10; ctr++) {
            int tValue = price[ctr] * quantity[ctr];
            System.out.println("Total Value[" + (ctr+1) + "]: " + tValue);
        }
    }
}