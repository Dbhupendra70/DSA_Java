import java.util.Scanner ;
public class num_sum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms(n) : ");
        int n = scanner.nextInt();

        int num_sum = 0;
        for(int i = 1 ; i<= n ; i++){

            num_sum += i ;
        }
        System.out.printf("The sum of  natural numbers from 1 to %d is = %d",n,num_sum);
        scanner.close();

    }
}
