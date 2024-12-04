//Llena, Earl Laurence
//CC2 1B

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        //Variables
        int choice, price1, price2, price3, price4, total, amount;
        
        System.out.println("\t\t\t MENU");
        System.out.println("______________________________________");
        System.out.println("1. Burger\t\t\t - PHP 100\n2. Fries\t\t\t - PHP 50\n3. Soda\t\t\t\t - PHP 30\n4. Ice Cream\t\t - PHP 45\n5. Exit");
        System.out.println("______________________________________");
        
        //tell the user to choose on the menu
        System.out.print("Enter the menu number of your choice; ");
        choice = sc.nextInt();
        
        switch (choice) {
            case 1: {
                price1 = 100;
                System.out.print("Enter the quantity; ");
                amount = sc.nextInt();
                
                total = price1 * amount;
                
                //displays the ordered item and the total amount of the item
                System.out.println("You ordered Burger.");
                System.out.println("Total amount: " + total + "PHP" );
                System.out.println("______________________________________");
                System.out.println("\tThank you for ordering!");
                
                break;
            }
            case 2: {
                price2 = 50;
                System.out.print("Enter the quantity; ");
                amount = sc.nextInt();
                
                total = price2 * amount;
                
                //displays the ordered item and the total amount of the item
                System.out.println("You ordered Fries.");
                System.out.println("Total amount: " + total + "PHP" );
                System.out.println("______________________________________");
                System.out.println("\tThank you for ordering!");
                
                break;
            }
            case 3: {
                  price3 = 30;
                System.out.print("Enter the quantity; ");
                amount = sc.nextInt();
                
                total = price3 * amount;
                
                //displays the ordered item and the total amount of the item
                System.out.println("You ordered Soda.");
                System.out.println("Total amount: " + total + "PHP" );
                System.out.println("______________________________________");
                System.out.println("\tThank you for ordering!");
                
                break;
            }
            case 4: {
                price4 = 45;
                System.out.print("Enter the quantity; ");
                amount = sc.nextInt();
                
                total = price4 * amount;
                
                //displays the ordered item and the total amount of the item
                System.out.println("You ordered Ice Cream.");
                System.out.println("Total amount: " + total + "PHP" );
                System.out.println("______________________________________");
                System.out.println("\tThank you for ordering!");
                
                break;
            }  
            case 5: {
                System.out.println("______________________________________");
                System.out.println("\tThank you for ordering!");
                
                break;
            }
        }
        
    }
}