import java.util.ArrayList;
import java.util.List;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            char current = s.charAt(i);
            int index = sb.indexOf(Character.toString(current));
            if (index == -1) {
                sb.append(current);
            } else {
                String newEntry = sb.toString();
                list.add(newEntry);
                sb = new StringBuilder();
                i = i - newEntry.length() + 1;
                sb.append(s.charAt(i));
            }
            i++;
        }
        if (sb.toString().length() > 0) {
            list.add(sb.toString());
        }
        int ret = 0;
        for (String val : list) {
            ret = Math.max(val.length(), ret);
        }
        return ret;
    }
}
