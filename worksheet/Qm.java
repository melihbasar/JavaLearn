package JavaLearn.worksheet;

import java.util.Scanner;

public class Qm {
    public static void main(String[]args){
        Scanner none = new Scanner(System.in);
        /*take the cars inputs in km/h and distance in meters */
        float km,dis;
        System.out.print("How fast is your car?(in km/h)");
        km = none.nextFloat();
        System.out.print("Whats the distance?(in m)");
        dis = none.nextFloat();
        /*turn km/h to m/s and then calculate how many secs would it take to reach that distance and print */
        float lastkm = km*1000/3600;

        System.out.printf("It will take " + (float)dis/lastkm +" seconds.");
        none.close();
    }
    
}
