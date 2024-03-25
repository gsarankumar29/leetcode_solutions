// import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        // Sort character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        // Check if sorted arrays are equal
        return Arrays.equals(sArray, tArray);
    }
}
