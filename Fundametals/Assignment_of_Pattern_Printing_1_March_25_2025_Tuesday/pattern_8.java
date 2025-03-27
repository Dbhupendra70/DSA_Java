public class pattern_8 {
    public static void main(String[] args) {
        int  n =4 ;

        for(int i=n ; i>0 ; i--){
            for (int j = i-1 ; j>0 ; j--){
                System.out.print(" ");
            }
            for (int k = 1 ; k<=((n+1)-i) ; k++){
                System.out.print((char)(64+k));
            }
            System.out.println();
        }
    }
    
}
