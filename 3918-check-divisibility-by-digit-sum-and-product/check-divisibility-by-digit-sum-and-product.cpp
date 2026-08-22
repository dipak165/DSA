class Solution {
public:
    bool checkDivisibility(int n) {

        string num = to_string(n);

        int add = 0;
        int mul = 1;

        for(char c : num) {
            add += c - '0';
            mul *= c - '0';
        }

        int add1 = add + mul;

        return n % add1 == 0;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna