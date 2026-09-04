class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mapS =new HashMap<>();
        HashMap<Character, Integer> mapT =new HashMap<>();

        for(int i= 0; i< s.length(); i++){

        char countS = s.charAt(i);
        char countT = t.charAt(i);
        mapS.put(countS, mapS.getOrDefault(countS, 0)+1);
        mapT.put(countT, mapT.getOrDefault(countT, 0)+1);
        
        }
        return mapS.equals(mapT);
    }
}
