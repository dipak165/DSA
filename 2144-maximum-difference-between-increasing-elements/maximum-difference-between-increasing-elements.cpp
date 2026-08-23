class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int n=nums.size();

        int minvalue =nums[0];
        int ans=-1;
        for(int i=1;i<n;i++){
            if(minvalue<nums[i]){
                ans=max(ans,nums[i]-minvalue);

            }

            minvalue=min(minvalue,nums[i]);
        }
        return ans;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna