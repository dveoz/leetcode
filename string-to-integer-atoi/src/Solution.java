class Solution {
    public int myAtoi(String str) {
        char[] cs = str.toCharArray();
        int counter = -1, effectiveLengh = cs.length - 1, multiplyer = 1, start = -1;
        long result = 0;
        boolean sign = false;

        while (counter++ < cs.length - 1) {
            if (start == -1 && (cs[counter] != 57 && cs[counter] != 56 && cs[counter] != 55 && cs[counter] != 54 &&
                                cs[counter] != 53 && cs[counter] != 52 && cs[counter] != 51 && cs[counter] != 50 &&
                                cs[counter] != 49 && cs[counter] != 48 && cs[counter] != 32 && cs[counter] != '-' &&
                                cs[counter] != '+')) {
                return 0;
            } else if (start > -1 && (cs[counter] < 48 || cs[counter] > 57)) {
                effectiveLengh = counter - start - 1;
                break;
            } else if (cs[counter] == ' ') {
                if (sign) return 0;
                effectiveLengh--;
            } else if (cs[counter] == '-' || cs[counter] == '+') {
                if (sign) return 0;
                multiplyer = multiplyer == 1 ? cs[counter] == '-' ? -1 : multiplyer : multiplyer;
                effectiveLengh--;
                sign = true;
            } else {
                start = start > -1 ? start : counter;
            }
        }

        while (effectiveLengh > -1) {
            result += (cs[start++] - 48) * Math.pow(10, effectiveLengh--);
        }
        result *= multiplyer;
        return result > Integer.MAX_VALUE ? Integer.MAX_VALUE :
               result < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) result;
    }
}
