class Solution:
    def runningSum(self, nums: list[int]) -> list[int]:
        ans=[]
        ans.append(nums[0])
        n=len(nums)
        for i in range(1,n):
            ans.append(nums[i]+ans[i-1])
        return ans

