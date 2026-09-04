class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0; // To store the maximum length of substring found
        int left = 0; // Left pointer for the sliding window
        Set<Character> charSet = new HashSet<>(); // Set to store unique characters in the current window

        // Iterate with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If character at the right pointer is already in the set, remove characters from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add the current character at the right pointer to the set
            charSet.add(s.charAt(right));

            // Calculate the current window size and update maxLength if needed
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
