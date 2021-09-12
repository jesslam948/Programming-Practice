class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        count_map = {0:1} # initialized with (0,1) bc at the beginning we can sum up to 0 at least 1 time
        running_sum = 0
        
        for i in range(0, len(nums)):
            running_sum += nums[i]
            count += count_map.get(running_sum - k, 0)
            count_map[running_sum] = count_map.get(running_sum, 0) + 1
        
        return count

        
        
# initial thoughts
# sliding window and slide right ptr until it's equal to k 
# if it goes over then move left ptr and check
# add up number of times our window = k
# ISSUE: this won't work when there are negative numbers 

# [1,1,1], k =2
# [1,2,3], k =3

#   x
# |-->|--0--|
# | | | | | | |
# |-------->|
#     x
    
#   x
# |-->|--k--|
# | | | | | | |
# |-------->|
#     x + k
    
#   x |------k----|
# |-->|--0--|--k--|  
# | | | | | | | | | |
# |-------->|
#     x
# |-------------->|
#        x + k
    
# - keep track of the running sum
# - keep track of whether or not we've encountered x before (runnSum - k)
#   - keep track of number of times we've encountered x before (hashmap)
# - if x encountered, then incr count


