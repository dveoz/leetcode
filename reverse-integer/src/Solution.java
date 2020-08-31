class Solution {
    public int reverse(int x) {
        char[] nx = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(nx).reverse();
        if (sb.indexOf("-") != -1) {
            sb.deleteCharAt(sb.indexOf("-"));
            sb.insert(0, "-");
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }

    public int reverseInt(int x) {
        long reverseNum = 0;
        while (Math.abs(x) > 0) {
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        return Math.abs(reverseNum) > Integer.MAX_VALUE ? 0 : (int) reverseNum;
    }
}
