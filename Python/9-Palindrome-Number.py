class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev=0
        ori=x
        while x>0:
            temp=x%10
            rev=(rev*10)+temp
            x=x//10
        return ori==rev
        
            
        