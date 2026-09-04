class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length());
            res.append("#");
            res.append(s);
        }
        return res.toString();
    }
    //4#neet4#code

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int aPointer = 0;
        while(aPointer<str.length()){
            int bPointer = aPointer;
            while(str.charAt(bPointer) != '#'){
                bPointer++;
            }
            int length = Integer.parseInt(str.substring(aPointer,bPointer));
            aPointer = bPointer+1;
            bPointer = aPointer+length;
            result.add(str.substring(aPointer,bPointer));
            aPointer = bPointer;
        }
        return result;
    }
}
