package JavaLearn.worksheet;

import java.util.Scanner;

public class Qq1 {
    public static void main(String[]args){
        Scanner the = new Scanner(System.in);

        System.out.print("number? ");
        int number = the.nextInt();

        String numberStr = Integer.toString(number);
        for(int i=0;i<3;i++){
            System.out.print(numberStr.charAt(i)+ " ");
        }
        
        the.close();




    }
    
}
