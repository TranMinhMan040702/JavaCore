package leetcode;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        String min = strs[0];
        if (strs.length == 0) return result;
        for (String current : strs) {
        	if (min.length() > current.length()) min = current;
        }
        int i = 0;
        while (i < min.length()) {
        	Character ch = min.charAt(i);
        	for (String str : strs) {
        		if (!ch.equals(str.charAt(i))) {
        			return result;
        		}
        	}
        	result = result + ch;
        	i++;
        }
        return result;
    }
}
