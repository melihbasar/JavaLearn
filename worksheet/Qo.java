package JavaLearn.worksheet;

import java.util.Scanner;

public class Qo {
    public static void main(String[]args){
        Scanner was = new Scanner(System.in);

        System.out.print("Whats the wholesale cost of the car? ");
        int whole = was.nextInt();

        int cost = whole + whole*12/100 + whole*6/100;

        System.out.printf("The cost of the car is: "+ cost);

        was.close();
        



    }
    
}
/*cost to the consumer = wholesale cost car + dealers percentage 12% + state taxes 6%    we need the xost to consumer from wholesale cost car*/









