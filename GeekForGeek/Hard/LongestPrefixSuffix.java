package GeekForGeek.Hard;

public class LongestPrefixSuffix {
    
}
class Solution {
    int getLPSLength(String s) {
        int n = s.length();
        int pref = 0 , suf = 1 , pos = 1 , count=0 ;
        char[] arr = s.toCharArray();
        
        while (pref < n && suf < n ){
            if(arr[pref] == arr[suf]){
                pref++ ;
                suf++ ;
                count++;
            }
            else{
                pref = 0 ;
                pos++ ;
                suf = pos ;
                count = 0 ;
            }
        }
        
        return count ;
        
    }
}
