class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        if len(nums)<=2:
            return len(nums)

        n=len(nums)
        count=2
        for i in range(2,n):
            if nums[i]!=nums[count-2]:
                nums[count]=nums[i]
                count+=1
        return count
        