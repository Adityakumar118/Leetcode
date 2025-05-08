class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        mp = {}

        for i in range(0,n):
            remain = target - nums[i]
            if remain in mp:
                return [mp[remain],i]
            mp[nums[i]] = i
        return []
        