import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Here is window is created based on 2 indices - left and right.
     * Right is moving first and increasing the counter for each found letter
     * until it won't meet a duplicate letter (counter for that letter will be 2)
     * <p>
     * Then left start moving after the right decreasing counter for duplicate char
     * when it finds it. When counter becomes less then 1 - duplicate is removed and
     * both indices are at the borders of non-repeatable sequence.
     * <p>
     * Calculating length and comparing it with previously found (if found) will give the outcome.
     *
     * @param s input String
     *
     * @return length of the longest character
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ret = 0, left = 0, right = 0, counter = 0;
        char[] str = s.toCharArray();
        char curr, curl;

        while (right < str.length) {
            // set right index
            curr = str[right++];
            counter = map.getOrDefault(curr, 0);
            map.put(curr, ++counter);

            // set left index
            while (counter > 1) {
                curl = str[left++];
                map.put(curl, map.get(curl) == 1 ? 0 : --counter);
            }
            ret = Math.max(ret, right - left);
        }
        return ret;
    }
}
