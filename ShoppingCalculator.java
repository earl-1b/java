import java.util.Scanner;

public class ShoppingCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //input for item1
        System.out.println("Enter the price of item 1. ");
        double item1 = sc.nextInt();
        System.out.println("Enter the quantity of item 1. ");
        double quantity1 = sc.nextInt();
        
        //input for item2
        System.out.println("Enter the price of item 2. ");
        double item2 = sc.nextInt();
        System.out.println("Enter the quantity of item 2. ");
        double quantity2 = sc.nextInt();
        
        //input for item3
        System.out.println("Enter the quantity of item 3. ");
        double item3 = sc.nextInt();
        System.out.println("Enter the quantity of item 3. ");
        double quantity3 = sc.nextInt();
        
        //calculation for the items
        item1 = item1 * quantity1;
        item2 = item2 * quantity2;
        item3 = item3 * quantity3;
        
        double subtotal = item1 + item2 + item3;
        //discount calculated with the use of percentage
        double discount = subtotal * 0.05;
        double salestax = (subtotal - discount) * 0.12;
        double finaltotal = (subtotal - discount) + salestax;
        
        System.out.println("Subtotal:PHP" + subtotal);
        System.out.println("Discount:PHP" + discount);
        System.out.println("Sales Tax:PHP" + salestax);
        System.out.println("Final Total Tax:PHP" + finaltotal);
       
        
        
        
        
        
        
        
    }
    
    
}