class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Optimization: if ransomNote is longer than magazine, it's impossible
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        
        int[] counts = new int[26];
        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }

       
        for (char c : ransomNote.toCharArray()) {
            if (counts[c - 'a'] == 0) {
                return false; // Character not available in required quantity
            }
            counts[c - 'a']--;
        }

        return true;
    }
}
