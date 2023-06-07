package leetcode;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}
	
	public static int climbStairs(int n) {
		
		int stepIsTwo = n / 2;
		int ans = 0;
		
		if (n == 1) return 1;
		
		for (int i = 0; i <= stepIsTwo; i++) {
			ans = ans + combine(n - i, i);
		}
		
		return ans;
		
	}

	public static int combine(int n, int k) {
		if (k > n) {
			return 0;
		} else if (k == 0 || k == n) {
			return 1;
		} else {
			return (combine(n - 1, k) + combine(n - 1, k - 1));
		}
	}

}
