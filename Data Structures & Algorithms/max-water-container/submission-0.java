class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high=heights.length-1;
        int maxwater=0;
        while(low<high){
            int less=Math.min(heights[low],heights[high]);
            int water=less*(high-low);
            if(low<high){
                low++;
            }
            else{
                high++;
            }
            maxwater=Math.max(water,maxwater);
        }
        return maxwater;
    }
}
