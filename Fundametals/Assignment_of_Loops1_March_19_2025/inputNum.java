import java.util.Scanner;

public class inputNum {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Integer = ");
        int n = scanner.nextInt();

        System.out.print("Output:- ");
        while(n>0){
            System.out.print(n+" ");
            n--;
        }
        scanner.close();
    }
}
