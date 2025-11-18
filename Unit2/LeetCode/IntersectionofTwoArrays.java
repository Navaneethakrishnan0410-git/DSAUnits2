package Unit2.LeetCode;

import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        for (int n : nums1) a.add(n);
        Set<Integer> inter = new HashSet<>();
        for (int n : nums2) if (a.contains(n)) inter.add(n);
        int[] ans = new int[inter.size()];
        int i = 0;
        for (int v : inter) ans[i++] = v;
        return ans;
    }
}
