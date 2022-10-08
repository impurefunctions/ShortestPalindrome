public class Main {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("bad"));

    }
    public static String shortestPalindrome(String s){
        int n = s.length();
        int i = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (s.charAt(i) == s.charAt(j)) {
                i += 1;
            }
        }
        if (i == n) {
            return s;
        }
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String anchor = shortestPalindrome(s.substring(0, i));
        return prefix + anchor + suffix;
    }
}
