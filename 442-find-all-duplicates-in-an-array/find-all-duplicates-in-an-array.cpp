class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;
        map<int, int> freq;
         for(int x : nums) {
           freq[x]++;
         }

for(auto it : freq) {
    if(it.second > 1){
        ans.push_back(it.first);
    }
}
return ans;

    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna