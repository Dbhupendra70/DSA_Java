// 1. Print all the odd numbers from 1 to 100.

class odd_num{
    public static void main(String [] args ) {
        int max_limit = 100 ;
        for ( int i  = 1 ; i <= max_limit ; i++ ){
            if( i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}