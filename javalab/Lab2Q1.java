package JavaLearn.javalab;
import java.util.Scanner;

public class Lab2Q1 {
    
    public static void main(String[] args) {
        
        Scanner num  = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        int a  = num.nextInt();
        
        System.out.print("Enter second number:");
        int b = num.nextInt();

        
        System.out.printf("The sum of the numbers: " + (a + b));
        System.out.printf("\nThe difference of the numbers: " + (a - b) );
        //take absoulute value next time 
        System.out.printf("\nThe product of  the numbers: "+ (a*b));
        num.close();
    }
    
}
