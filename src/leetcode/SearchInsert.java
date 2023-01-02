package leetcode;

public class SearchInsert {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 2;
		System.out.println(searchInsert(nums, target));

	}
	// O(log n) runtime complexity.
	public static int searchInsert(int[] nums, int target) {
		int result = 0;
		int firstIndex = 0;
		int lastIndex = nums.length - 1;
		
		while(firstIndex <= lastIndex) {
			int middleIndex = (int) Math.floor((firstIndex + lastIndex) / 2);
			
			if (nums[middleIndex] == target) {
				result = middleIndex;
				break;
			} else if (nums[middleIndex] > target) {
				lastIndex = middleIndex - 1;
			} else {
				firstIndex = middleIndex + 1;
				result = middleIndex + 1;
			}
		}
		
		return result;
	}
}
