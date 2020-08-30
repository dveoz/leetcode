public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int nm) {
        Long n = Integer.toUnsignedLong(nm);
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(nm));
        sb.reverse();
        return (int) Long.parseLong(sb.toString(),2) << (32 - sb.toString().length());
    }
}
