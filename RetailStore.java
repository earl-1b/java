//Llena Earl laurece A.
//final challenge no.1

import java.util.Scanner;


public class RetailStore {
    public static void main(String[] args){
        
        //declaration of scanner
        Scanner input = new Scanner(System.in);
        
        //declaration of array
        double[] price = new double[10];
        int[]quantity = new int[10];
        
        for (int i = 0; i < 10; i++ ){
            //tell the user to intput a price for the product
            System.out.println("Enter the price" + (i + 1) + "; ");
            price[i] = input.nextDouble();
            //tell the user to input a quntity for the product
            System.out.println("Enter the quantity" + (i + 1) + "; ");
            quantity [i] = input.nextInt();
        }
        
        //Calculate the total value by multiflying the quantity and price
        double totalvalue = 0;
        for (int i = 0; i < 10; i++ ){
           totalvalue += price[i] * quantity[i];
           
            
        }
        //show the total value 
       System.out.printf("\nthe total value is: $%,.2f\n", totalvalue);
   }
}