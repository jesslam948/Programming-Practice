class Solution:
    def minimumDeletions(self, nums: List[int]) -> int:
        n = len(nums)
        if n <= 2 : return n
        min_idx = nums.index(min(nums))
        max_idx = nums.index(max(nums))
        first = min(min_idx, max_idx)
        second = max(min_idx, max_idx)
        return min(first + 1 + n - second,
                   second + 1,
                   n - first)
        # 1st case: front & back
        # 2nd case: both from front
        # 3rd case: both from back
