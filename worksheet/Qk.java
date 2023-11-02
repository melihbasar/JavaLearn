package JavaLearn.worksheet;

import java.util.Scanner;

public class Qk {
    
    public static void main(String[] args){
        Scanner exam = new Scanner(System.in);
        float Midterm1 , Midterm2 , Final;

        System.out.print("Whats your first Midterm? ");
        Midterm1 = exam.nextInt();

        System.out.print("Whats your second Midterm? ");
        Midterm2 = exam.nextInt();
        
        System.out.print("Whats your Final? ");
        Final = exam.nextInt();
        
        System.out.printf("Average grade: "+(Midterm1 + Midterm2 + Final)/3); 
        
        /*i wanna add %.3f to the code at the end but the program just crashes you have to find a way */ 
        exam.close();








    }
    
}
