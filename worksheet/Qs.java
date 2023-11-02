package JavaLearn.worksheet;

import java.util.Scanner;

public class Qs {
    public static void main(String[]args){
        Scanner damn = new Scanner(System.in);

        System.out.print("Gimme sum minutes boi ");
        int min =damn.nextInt();

        int d = min /1440;
        int h= (min - d*1440)/60;
        int m = min - d*1440 - h*60;

        System.out.printf(d + " days " + h +" hours " + m+" minutes");
        damn.close();



    }    
}
