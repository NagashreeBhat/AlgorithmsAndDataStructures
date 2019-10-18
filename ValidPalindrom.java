//Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

public class ValidPalindrom {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }
}
