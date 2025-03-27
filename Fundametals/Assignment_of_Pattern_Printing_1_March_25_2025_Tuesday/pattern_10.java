public class pattern_10 {
    public static void main(String[] args) {
        int  n =4 ,i  ;

        for( i=n ; i>0 ; i--){
            for (int j = i-1 ; j>0 ; j--){
                System.out.print(" ");
            }
            for (int k = 1 ; k<=((n+1)-i) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( i=1; i<=n-1 ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(" ");
            }
            for (int k = ((n+1)-i) ; k>1 ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
