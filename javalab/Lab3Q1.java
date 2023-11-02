package JavaLearn.javalab;
import java.util.*;

public class Lab3Q1 {
    public static void main(String[]args){
        Scanner i = new Scanner(System.in);
        System.out.printf("Enter value for q: ");
            Double q = i.nextDouble();

        System.out.printf("Enter value for r: ");
            Double r = i.nextDouble();
        
        System.out.printf("Enter value for s: ");
            Double s = i.nextDouble();
        
        System.out.printf("Enter value for t: ");
            Double t = i.nextDouble();

        double a =  Math.pow(Math.pow(q,3.0)+s,4.0)/Math.pow(t,0.4);
        double b= Math.abs((r*s)/Math.pow(r,1.5));
        double c= Math.pow(a+b,3);


        
        System.out.printf("The result is: "+ c) ;
        
        i.close();
        















    }

  
    
 
   
    
    
}

