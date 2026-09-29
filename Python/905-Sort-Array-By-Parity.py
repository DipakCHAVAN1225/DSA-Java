class Solution:
    def sortArrayByParity(self, nums: list[int]) -> list[int]:
        output=[]
        count=0
        last=len(nums)-1
        for i in range(0,len(nums)):
            if nums[i]%2==0:
                output.insert(count,nums[i])
                count+=1
            else:
                output.insert(last,nums[i])
                last-=1
            

        return output
        