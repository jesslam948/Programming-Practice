# 09.02.2021

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_dict = {}
        
        for i in range(0, len(nums)):
            complement = target - nums[i]
            if complement in my_dict:
                return [my_dict[complement], i]
            my_dict[nums[i]] = i
            
        return [-1, -1]
