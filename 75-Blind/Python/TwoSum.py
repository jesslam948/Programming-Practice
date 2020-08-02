class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_dict = {}
        
        for i in range (len(nums)):
            comp = target - nums[i];
            if comp in my_dict:
                return [i, my_dict.get(comp)]
            my_dict[nums[i]] = i;
        
        return [-1, -1]
