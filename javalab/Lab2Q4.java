package JavaLearn.javalab;
import java.util.Scanner;
public class Lab2Q4 {
    public static void main(String[]args){
        double num1,num2;
        char ch1,ch2;
        
        System.out.print("Enter two double numbers: ");
        Scanner sc1 =new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);

        num1= sc1.nextDouble();
        num2=sc2.nextDouble();

        System.out.printf("Enter two characters: ");
        ch1 = sc2.next().charAt(0);
        ch2 = sc2.next().charAt(0);

        double avg= (num1+num2)/2 ;
        System.out.printf("Average is : "+ avg);
        System.out.printf("\nTwo characters are: "+ ch1 + " and "+ ch2);
        //%.2f not working again
        sc1.close();
        sc2.close();

    }
    
}
