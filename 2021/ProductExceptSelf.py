class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1 for x in range(len(nums))]
        
        # left -> right
        running_prod = nums[0]
        for i in range(1, len(nums)):
            result[i] *= running_prod
            running_prod *= nums[i]
        
        # right -> left
        running_prod = nums[-1]
        for j in range(len(nums) - 2, -1, -1):
            result[j] *= running_prod
            running_prod *= nums[j]
        
        return result
        
# [a, b, c, d] --> [bcd, acd, abd, abc] 
# an observation of a trend: [|bcd, a|cd, ab|d, abc|]
# initialize the resulting array to all 1s
# keep a running product total
 
