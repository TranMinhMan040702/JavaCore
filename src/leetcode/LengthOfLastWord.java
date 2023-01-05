package leetcode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String str =  "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(str));
	}
	
    public static int lengthOfLastWord(String s) {
//    	s = s.trim();
//    	String[] worlds =  s.split(" ");
//    	return worlds[worlds.length - 1].length();
    	String trim = s.trim();
    	int lastWordindex = trim.lastIndexOf(" ") + 1;
    	return trim.length() - lastWordindex;
    }
}
