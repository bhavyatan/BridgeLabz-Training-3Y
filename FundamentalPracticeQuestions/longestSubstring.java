import java.util.*;
public class longestSubstring{
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest substring without repeating characters: " + findLongestSubstring(str));
    }

     public static String findLongestSubstring(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isUnique(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        return longest;
    }
    public static boolean isUnique(String s){
        Set<Character> chars = new HashSet<>();
        for(char c : s.toCharArray()){
            if(chars.contains(c)){
                return false;
            }
            chars.add(c);
        }
        return true;    
    }
}
   