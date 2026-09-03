class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        vector<int > odd;
        vector<int >even;
        vector<int > ans;
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even.push_back(nums[i]);
            }else{
                odd.push_back(nums[i]);
            }
        }

        for(int i=0;i<even.size();i++){
            ans.push_back(even[i]);
        }
        for(int i=0;i<odd.size();i++){
            ans.push_back(odd[i]);
        }

        return ans ;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna