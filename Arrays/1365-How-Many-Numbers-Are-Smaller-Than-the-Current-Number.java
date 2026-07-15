class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sm=new int[nums.length];
        int big=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                  if(nums[i]>nums[j]){
                    big++;
                  }

            }
            sm[i]=big;
            big=0;
        }
        return sm;
    }
}