// 2. Print all numbers from 1 to 100 that are divisible by 3

public class divisible_by_3 {
    public static void main(String[] args) {
        int max_limit = 100 ;
        for ( int i  = 1 ; i <= max_limit ; i++ ){
            if( i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
