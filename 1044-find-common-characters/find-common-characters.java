class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
         for (char ch : words[0].toCharArray()) {
            minFreq[ch - 'a']++;
        }

        // Compare frequencies with every remaining word
        for (int i = 1; i < words.length; i++) {
            
            int[] freq = new int[26];
            
            for (char ch : words[i].toCharArray()) {
                freq[ch - 'a']++;
            }

            // Keep minimum frequency
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], freq[j]);
            }
        }

        // Build answer
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna