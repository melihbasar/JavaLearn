package JavaLearn.javalab;
import java.util.Scanner;
public class Lab2Q3 {
    public static void main(String[]args){
        Scanner i = new Scanner(System.in);
        int a, b;
        System.out.print("Enter third number: ");
        a = i.nextInt();
        System.out.print("Enter fourth number: ");
        b = i.nextInt();

        System.out.printf("Sum is: "+ (3+5+a+b));

        System.out.printf("\nAverage is: "+((3+5+a+b)/4.0));
        i.close();

    }
    
}
