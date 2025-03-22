// 4. Display this GP - 3,12,48,.. upto ‘n’ terms
import java.lang.Math;
import java.util.Scanner;

public class gp1 {
    public static void main(String[] args) {
        double a= 3 , r = 4 , term ;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        

        System.out.println("The first " + n + " terms of the GP are:");

        for(double i = 0 ; i< n ; i ++){
        
            term = a * Math.pow(r,i);
    
            System.out.print((int)term + " ");
        }
        // Close the scanner to avoid resource leak
        scanner.close();
    }
    
}