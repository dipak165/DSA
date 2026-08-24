class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int current = nums[i];

            if(mp.containsKey(current)){
                int previous=mp.get(current);

                if((i-previous)<=k){
                    return true;
                }
            }
            mp.put(current,i);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna