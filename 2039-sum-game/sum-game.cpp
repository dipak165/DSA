class Solution {
public:
    bool sumGame(string num) {
        int n=num.size();
        int qdiff=0;
        int diff=0;
        for(int i=0;i<n/2;i++){
            if(num[i]=='?'){
                qdiff++;

            }else{
                diff+=num[i]-'0';
            }
        }

        for(int i=n/2;i<n;i++){
            if(num[i]=='?'){
                qdiff--;

            }else{
                diff-=num[i]-'0';
            }
        }

        if (qdiff==0){
            return diff!=0;
        }

        return diff*2 != -9*qdiff;
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna