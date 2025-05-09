class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0]*n
        pos,neg= 0,1

        for i in range(0,n):
            if nums[i]>=0:
                result[pos]= nums[i]
                pos +=2
            else:
                result[neg] =  nums[i]
                neg +=2
        return result