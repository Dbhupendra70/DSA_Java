// 5. WAP to print the sum of all the even digits of a given number. Sample Input: 4556 ,Output: 10

import java.util.Scanner;

public class even_digi_sum {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number(n) : ");
    int n = scanner.nextInt() ;

    int even_digit_sum = 0 , digit ;
    while (n != 0) {
        digit = n%10 ;
        if (digit%2 == 0) {
            even_digit_sum += digit ;
        } 
        n /=10 ;
    }
    System.out.printf("Your even digit sum for given number is %d %n ", even_digit_sum);

    scanner.close();
 }    
}
