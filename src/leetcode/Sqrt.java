package leetcode;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println(mySqrt(4));
	}

	public static int mySqrt(int x) {
		int start = 1;
		int end = x;
		int ans = 0;
		while (end >= start) {
			int mid = (int) Math.floor(start + (end - start) / 2);
			int midSqrt = mid * mid;
			if (x == midSqrt) {
				return mid;
			} else if (midSqrt > x) {
				end = mid - 1;
			} else {
				start = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}

}
