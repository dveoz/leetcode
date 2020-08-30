public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] data = {"pwwkew", "tmmzuxt", "dvdf", "abcabcbb", "bbbbb"};
        String[] res = {"3", "5", "3", "3", "1"};

        int i = -1;
        while (i < data.length) {
            System.out.printf("%s => %s\n", solution.lengthOfLongestSubstring(data[++i]), res[i]);
        }
    }
}
