

public class pattern_1 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1 ; i <= n ; i++){
            for (int k = n-i ; k >=0 ; k--){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (2*i - 1) ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
