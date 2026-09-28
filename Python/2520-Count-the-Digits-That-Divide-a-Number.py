class Solution:
    def countDigits(self, num: int) -> int:
        count=0
        copy=num
        if copy < 9:
            return 1
        while num>0:
            temp=num%10
            if copy%temp==0:
                count+=1
            num=num//10
        return count
        