import java.util.*;

class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {

        int n = security.length;
        List<Integer> ans = new ArrayList<>();

        int[] left = new int[n];
        int[] right = new int[n];

        // Count non-increasing days from the left
        for (int i = 1; i < n; i++) {
            if (security[i] <= security[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        // Count non-decreasing days from the right
        for (int i = n - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        // Check valid days
        for (int i = 0; i < n; i++) {
            if (left[i] >= time && right[i] >= time) {
                ans.add(i);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna