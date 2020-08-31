public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int f0 = s.myAtoi("   -42 sdfsd -");
        int f1 = s.myAtoi("-1234");
        int f2 = s.myAtoi("-0");
        int f3 = s.myAtoi("asd     10");
        int f4 = s.myAtoi("1000");
        int f5 = s.myAtoi("-10.23453125");
        int f6 = s.myAtoi("-91283472332");
        int f7 = s.myAtoi(".3472332");
        int f8 = s.myAtoi("+-3");
        int f9 = s.myAtoi("-   3");
    }
}
