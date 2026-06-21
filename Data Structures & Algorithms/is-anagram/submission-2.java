class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map=new HashMap<>();
        //put character and their count
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //remove count of character
        for(char c:t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }

            map.put(c,map.get(c)-1);

            if(map.get(c)==0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
