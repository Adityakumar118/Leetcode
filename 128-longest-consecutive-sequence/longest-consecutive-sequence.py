class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        my_set = set(nums) 
        longest = 0

        for i in my_set:
            if i-1 not in my_set:
                x= i
                cnt = 1
                while x+1 in my_set:
                    x+=1
                    cnt +=1
                longest = max(longest,cnt)
        return longest
          
        