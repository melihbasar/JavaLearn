package JavaLearn.javalab;
import java.util.Scanner;
public class Lab2Q2 {
    public static void main(String[] args) {
        Scanner need = new Scanner(System.in);
        
        System.out.printf( "Enter the value of a , b and c:" );
        int a  = need.nextInt();
        int b = need.nextInt();
        int c = need.nextInt();
        
        System.out. printf("Enter the value of e and t: ");
        double e = need.nextDouble();
        double t = need.nextDouble();

        System.out.printf("Result is:" + (double)((a+ (c + 1/e)/(b*t/a))/((c*e)/((b+1)/b))) );
            //need to add only 3 decimal points with %.3f but it doesnt work
        need.close();
    }
    
}
