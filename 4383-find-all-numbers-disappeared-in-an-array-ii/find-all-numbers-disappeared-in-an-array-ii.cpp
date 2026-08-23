class Solution {
public:
    vector<vector<int>> findDisappearedNumbers(vector<int>& nums, int lower, int upper) {

         vector<int> freq(100001, 0);

        // Store frequency
        for(int x : nums) {
            freq[x]++;
        }

        vector<vector<int>> ans;

        int i = lower;

        while(i <= upper) {

            // Present -> skip
            if(freq[i] > 0) {
                i++;
                continue;
            }

            // Missing number found
            int start = i;

            // Find consecutive missing numbers
            while(i <= upper && freq[i] == 0) {
                i++;
            }

            int end = i - 1;

            ans.push_back({start, end});
        }
        return ans;

        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna