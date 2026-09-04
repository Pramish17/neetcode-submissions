class Solution {
    public boolean isPalindrome(String s) {
        String value = "";
        for (char c: s.toCharArray()){
            if (Character.isDigit(c) || Character.isLetter(c)) {
                value += c;
            }
        }
        value = value.toLowerCase();

        int aPointer = 0;
        int bPointer = value.length() - 1;

        while (aPointer <= bPointer) {
            if (value.charAt(aPointer) != value.charAt(bPointer)) {
                return false;
            }
            aPointer += 1;
            bPointer -= 1;
        }
        return true;
    }
}
