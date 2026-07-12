class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;

        for(int i=0;i<nums.length;i++){
            int currNum=0;
            int length=1;
            if(!set.contains(nums[i]-1)){
                currNum=nums[i];
            }
            while(set.contains(currNum+1)){
                length++;
                currNum++;
            }
            longest=Math.max(length,longest);
        }
        return longest;
    }
}
