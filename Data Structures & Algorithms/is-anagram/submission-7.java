class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

      HashMap<Character, Integer> sMap = new HashMap<>();
      HashMap<Character, Integer> tMap = new HashMap<>();

      for(int i = 0; i<s.length(); i++){
        char sCount = s.charAt(i);
        char tCount = t.charAt(i);

        sMap.put(sCount, sMap.getOrDefault(sCount, 0)+1);
        tMap.put(tCount, tMap.getOrDefault(tCount, 0)+1);
      }  
      return (sMap.equals(tMap));
    }
}
