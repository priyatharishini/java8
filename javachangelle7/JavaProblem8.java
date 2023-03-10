package javachangelle7;

import java.util.HashSet;
import java.util.Set;

public class JavaProblem8 
{
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
              
            }
            if (!set.add(nums[i])) {
                return true;
               
            }
            System.out.println(set); 
        }
        return false;
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println(result);	
      
	}

}
