package leetcode;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3, n = 3;
		merge(nums1, m, nums2, n);
		
		for (int item : nums1) {
			System.out.println(item);
		}
	}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1, n2 = n - 1, i = m + n - 1;
        
        while (n2 >= 0) {
        	if (n1 >= 0 && nums1[n1] > nums2[n2]) {
        		nums1[i] = nums1[n1];
        		i--;
        		n1--;
        	} else {
        		nums1[i] = nums2[n2];
        		i--;
        		n2--;
        	}
        }
        
    }
}
