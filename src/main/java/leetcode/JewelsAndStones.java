package leetcode;

// Problem 771
public class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {
        int jewels = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) >= 0) jewels++;                
        }
        
        return jewels;
    }
}
