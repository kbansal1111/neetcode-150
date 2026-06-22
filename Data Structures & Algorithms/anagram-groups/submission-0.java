class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(String s:strs){
            char[] s1=s.toCharArray();
            Arrays.sort(s1);

            String key=new String(s1);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
