//Lllena, Earl laurence A.
//CC2 1-B

import java.util.Scanner;

public class GroceryDiscount {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //declaration of variable
        double amount, discount, finalPrice;
        
        int x;
        //input of total purcahse
        System.out.print("Enter the total purchase amout: PHP ");
        amount = sc.nextInt();
        
    if (amount < 1000) {
        System.out.println("Discount applied: 0% ");
            
        x = (int) amount;
        System.out.println("Final price after discount: PHP " + x);
        
    } else if (amount >= 1000 && amount <= 5000) {
        System.out.println("Discount applied: 5% ");
        
        discount = amount * 0.05;
        finalPrice = amount - discount;
        
        x = (int) finalPrice;
        System.out.println("Final price after discount: PHP " + x);
    } else if (amount >= 5000 && amount <= 10000) {
        System.out.println("Discount applied: 10% ");
        
        discount = amount * 0.10;
        finalPrice = amount - discount;
        
        x = (int) finalPrice;
        System.out.println("Final price after discount: PHP " + x);
    }

        
        
    }
}