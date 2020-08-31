class Solution {
    public boolean isPalindrome(int x) {
        char[] cs = String.valueOf(x).toCharArray();
        int left = 0, right = cs.length - 1;
        while (left < right) {
            if (cs[left++] != cs[right--]) return false;
        }
        return true;
    }

    public boolean isPalindromeWithoutConversion(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reverseNumber = 0;
        while (x > reverseNumber) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }
        return x == reverseNumber || x == reverseNumber / 10;
    }
}
