class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);     
        }
        List<Integer> lst=  new ArrayList<>(map.keySet());
        Collections.sort(lst,Collections.reverseOrder());

        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=lst.get(i);
        }
        return ans;
    }
}