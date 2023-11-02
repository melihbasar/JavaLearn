package JavaLearn.worksheet;

import java.util.Scanner;

public class Qi {
    public static void main(String[] args){
        Scanner curr = new Scanner(System.in);
        
    
    System.out.print("How much TL? ");
    int tl =curr.nextInt();

    double r = tl / 27.87 ;

    System.out.printf("In dollars:"+ r);
        curr.close();
    }

    
}
