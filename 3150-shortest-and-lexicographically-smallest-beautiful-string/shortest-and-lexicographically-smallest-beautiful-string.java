class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
         ArrayList<Integer> pos = new ArrayList<>();

        // Store positions of all 1s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                pos.add(i);
            }
        }

        // Not enough 1s
        if (pos.size() < k) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        String ans = "";

        // Check every group of k consecutive 1s
        for (int i = 0; i + k - 1 < pos.size(); i++) {

            int start = pos.get(i);
            int end = pos.get(i + k - 1);

            int len = end - start + 1;

            String candidate = s.substring(start, end + 1);

            // Better length
            if (len < minLen) {
                minLen = len;
                ans = candidate;
            }

            // Same length -> lexicographically smaller
            else if (len == minLen && candidate.compareTo(ans) < 0) {
                ans = candidate;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna