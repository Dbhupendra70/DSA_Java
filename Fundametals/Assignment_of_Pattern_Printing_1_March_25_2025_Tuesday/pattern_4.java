public class pattern_4 {
    public static void main(String[] args) {
        int n = 5 , i = 0;

        for( i = 0 ; i<n ; i++){
            for (int j = 0 ; j<=i ; j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
        for(int  i2 = i-1 ; i2>0 ; i2--){
            for (int j = i2 ; j>0 ; j--){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
