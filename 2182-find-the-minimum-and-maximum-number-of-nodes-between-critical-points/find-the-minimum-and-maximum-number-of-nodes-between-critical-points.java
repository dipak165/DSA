import java.util.*;

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ArrayList<Integer> ans = new ArrayList<>();

        // Store linked list values
        ListNode temp = head;

        while (temp != null) {
            ans.add(temp.val);
            temp = temp.next;
        }

        ArrayList<Integer> critical = new ArrayList<>();

        // Find indices of critical points
        for (int i = 1; i < ans.size() - 1; i++) {

            if (
                (ans.get(i) < ans.get(i - 1) && ans.get(i) < ans.get(i + 1))
                ||
                (ans.get(i) > ans.get(i - 1) && ans.get(i) > ans.get(i + 1))
            ) {
                critical.add(i);
            }
        }

        // Need at least 2 critical points
        if (critical.size() < 2) {
            return new int[]{-1, -1};
        }

        // Minimum distance
        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i < critical.size(); i++) {
            minDistance = Math.min(
                minDistance,
                critical.get(i) - critical.get(i - 1)
            );
        }

        // Maximum distance = last critical index - first critical index
        int maxDistance =
            critical.get(critical.size() - 1) - critical.get(0);

        return new int[]{minDistance, maxDistance};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna