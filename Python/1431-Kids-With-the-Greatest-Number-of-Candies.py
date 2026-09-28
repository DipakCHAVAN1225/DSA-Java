class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        output=[]
        greatest=max(candies)
        for i in candies:
            if i+extraCandies<greatest:
                output.append(False)
            else:
                output.append(True)
        return output
