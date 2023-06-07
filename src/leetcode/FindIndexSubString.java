package leetcode;

public class FindIndexSubString {
	public static void main(String[] args) {
		System.out.println(indexOfSubString("sadbutsad", "sad"));
	}

	public static int indexOfSubString(String haystack, String needle) {

		int index = 0, ans = 0;
		int lengthOfHayStack = haystack.length(), lengthOfNeedle = needle.length();

		if (haystack.equals(needle)) {
			return ans;
		}

		while (ans <= lengthOfHayStack - lengthOfNeedle) {
			index = ans;
			for (int i = 0; i < lengthOfNeedle; i++) {
				if (haystack.charAt(index) == needle.charAt(i)) {
					index++;
				} else {
					ans++;
					break;
				}
			}
			if (index - ans == lengthOfNeedle) {
				return ans;
			}
		}
		return -1;
	}

}
