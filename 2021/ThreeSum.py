class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        results = [] 
        if len(nums) < 3:
            return results
        
        # sort the numbers
        nums.sort()
        
        for i in range(0, len(nums) - 2):
            # disregard duplicates
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            
            target = -1 * nums[i]
            low = i + 1
            high = len(nums) - 1

            while low < high:
                if nums[low] + nums[high] == target:
                    results.append([nums[i], nums[low], nums[high]])

                    ## move pointers and also avoid duplicates
                    while low < high and nums[low] == nums[low + 1]:
                        low += 1
                    while low < high and nums[high] == nums[high - 1]:
                        high -= 1
                    
                    low += 1
                    high -= 1

                elif nums[low] + nums[high] < target:
                    low += 1
                else:
                    high -= 1
            
        return results
