class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // Under the constraint 1 <= num <= 10^5,
            // A number has an even number of digits if:
            // - It has 2 digits: [10, 99]
            // - It has 4 digits: [1000, 9999]
            // - It has 6 digits: [100000] (boundary of 10^5)
            if ((num >= 10 && num <= 99) || 
                (num >= 1000 && num <= 9999) || 
                num == 100000) {
                count++;
            }
        }
        return count;
    }
}
