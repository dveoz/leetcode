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
}
