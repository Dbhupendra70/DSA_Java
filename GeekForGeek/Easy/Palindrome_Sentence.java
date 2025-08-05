package GeekForGeek.Easy;
// import java.util.Character;
class palindrome {
    public boolean isPalinSent(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        while (i < j) {
            // Skip non-alphanum 
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            // Compare chars in a case-insensitive 
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        } 
        return true; 
    }
}