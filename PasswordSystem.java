//llena earl laurence A
//Lab Challenge 7

//scanner
import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {

        //declaration of the variables
        Scanner input = new Scanner(System.in);
        String pass, pattern;
        boolean valid = false;

        //initialization of the regex pattern for checking the contents of the password
        pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}";

        //initialization of the loop using do-while
        do {
            //prompts the user to enter the password
            System.out.print("Enter your password: ");
            pass = input.next();

            //checks if the input is invalid
            if (pass.length()<8) {
                valid = false;
                System.out.println("Password must have at least 8 letters!");

                //continues the program to check
                continue;
            }
            //checks if the input matches regex pattern
            if (pass.matches(pattern)) {
                valid = true;
            } else {
                valid = false;
                System.out.println("Password must have at least a capital letter and number!");
            }
        }
        //if the password is valid, it ends the program
        while(!valid);
        System.out.println("Your password is valid!");
    }
}}