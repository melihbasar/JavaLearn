package JavaLearn.javalab;
import java.util.*;
public class Lab3Q2 {
    public static void main(String[]args){
        Scanner bin = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int n = bin.nextInt();
        int x = 0 ;
        int c=0;
        for(int i=0;i<5;i=i+1){ 
            int b = n%10;
            n = (int)n/10; 
            x=(int)Math.pow(2,i*b)*b + x;
            c = c+ b*1;
              
        }
        System.out.printf("decimal equivilent: "+x+" "+c);
        bin.close();
        }
    }

    /*// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Question_2 {
   public Question_2() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a binary number: ");
      int number = scanner.nextInt();
      int d1 = number / 10000;
      int d2 = number % 10000 / 1000;
      int d3 = number % 1000 / 100;
      int d4 = number % 100 / 10;
      int d5 = number % 10;
      int decimal = d5 + d4 * 2 + d3 * 4 + d2 * 8 + d1 * 16;
      System.out.printf("Decimal equivalent is %d", decimal);
      int n1 = decimal / 10;
      int n2 = decimal % 10;
      System.out.printf(" and sum of its digits is %d%n", n1 + n2);
      scanner.close();
   }
}
 */

    

