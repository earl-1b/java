//September 11,2024
//Earl Laurence A. Llena
//The use of variable


public class Variable {
  public static void main(String[] args) { 
   String name = "Anna";          
   int age=18;                       
   int fNum=10;
   int sNum=3;
   
   
   //Arthemic Operators
   int sum = fNum + sNum;
   int pro = fNum * sNum;
   int quo = fNum / sNum;
   int rem = fNum % sNum; 
   
   float itemPrice =25.95f;
   char symbol='$';
   boolean value = true;
   final float pi= 3.14565f;
   
   //Display the value of variables
   System.out.println("Hi, I'm " + name + ".");
   System.out.println("I\'m " + age + " years old.");
   System.out.println("The amount of the item is " + itemPrice + symbol );
   System.out.println("The value is " + value);
   System.out.println("The sum is " + sum );
   System.out.println("The quotient is " + quo );
   System.out.println("The remainder is " + rem );
  }
}