public class stringPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Is the string a palindrome? " + isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}