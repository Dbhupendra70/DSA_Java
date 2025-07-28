import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubarrays {
    
    public int findSubarray(int[] arr) {
        int n = arr.length ;
        
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0 ;
        int prefixSum = 0 ;
        
        map.put(0, 1);  // To handle cases where subarray starts from index 0
        for(int i = 0 ; i<n ; i++ ){
            prefixSum += arr[i];
            
            count += map.getOrDefault(prefixSum,0);
    
            map.put(prefixSum , map.getOrDefault(prefixSum,0)+1);
        }
        
        return count ;
    }
}


/*
You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0.

Examples:

Input: arr[] = [0, 0, 5, 5, 0, 0]
Output: 6
Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].
Input: arr[] = [6, -1, -3, 4, -2, 2, 4, 6, -12, -7]
Output: 4
Explanation: The 4 subarrays are [-1, -3, 4], [-2, 2], [2, 4, 6, -12], 
and [-1, -3, 4, -2, 2]
Input: arr[] = [0]
Output: 1
Explanation: The only subarray is [0].
Constraints:    
1 <= n <= 106
-109 <= arr[ i ] <= 109

 * This class is a placeholder for the implementation of the Zero Sum Subarrays problem.
 * It will contain methods to find all subarrays that sum to zero in a given array.
 */