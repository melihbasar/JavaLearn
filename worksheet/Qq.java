package JavaLearn.worksheet;

import java.util.Scanner;

public class Qq {
    public static void main(String[]args){
        Scanner the = new Scanner(System.in);

        System.out.print("Whats your three digit number? ");
        int i = the.nextInt();

        int k=  i/100;
        int l= (i - k*100) /10;
        int m= (i - k*100 -l*10);
        
        System.out.printf("Your numbers are" +" "+ k+" " + l +" "+ m);
        the.close();

    } 
    
}
/* i dont know how to slice strings in java so i will divide it by a 100 and take the result as a integer and 
i will duplicate that integer by 100 and i will substract it with the first and ill do the same with 10 and then 1 and 
i will print them one by one  */