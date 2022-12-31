package leetcode;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {-3,-1,0,0,0,3,3};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
	    if (nums.length <= 1)
	        return nums.length;
	    
	    int dup = 0;
	    
	    for (int i = 1; i < nums.length; i++) {
	    	if (nums[i] == nums[i - 1]) {
	    		dup++;
	    	}
	    	nums[i - dup] = nums[i];
	    }
	    
	    return nums.length - dup;
	}
}
