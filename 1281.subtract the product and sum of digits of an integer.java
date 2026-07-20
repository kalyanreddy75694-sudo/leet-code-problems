class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10; // Reminder value 
            product *= digit;
            sum += digit;
            n /= 10; // Quotient value 
        }       
        return product - sum;
    }
}
