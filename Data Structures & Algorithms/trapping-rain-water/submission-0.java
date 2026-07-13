class Solution {
    public int trap(int[] height) {
        int water=0;
        for(int i=0;i<height.length;i++){

            int leftmax=height[i];
            int rightmax=height[i];

            for(int j=0;j<=i;j++){
                leftmax=Math.max(leftmax,height[j]);
            }

            for(int k=i;k<height.length;k++){
                rightmax=Math.max(rightmax,height[k]);
            }

            int minhght=Math.min(leftmax,rightmax);

            water+=minhght-height[i];

        }
        return water;
    }
}
