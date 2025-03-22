// 3. Display this AP - 4,7,10,13,16.. upto ‘n’ terms

import java.util.Scanner;

public class ap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        int a = 4, d = 3 ;

        System.out.println("The first " + n + " terms of the AP are:");

        for(int i = 0 ; i< n ; i ++){
        
            int term = a + (i * d);
    
            System.out.print(term + " ");
        }
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
