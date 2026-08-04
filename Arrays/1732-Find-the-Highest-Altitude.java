class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        int curr=0;
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[curr]+gain[curr];
            curr++;
        }
        int big=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>big){
                big=ans[i];
            }
        }
        return big;
    }
}