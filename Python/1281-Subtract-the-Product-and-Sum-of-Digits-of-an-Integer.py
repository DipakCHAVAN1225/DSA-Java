class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        product=1
        addition=0
        while n>0:
            temp=n%10
            product*=temp
            addition+=temp
            n=n//10
        return product-addition
        