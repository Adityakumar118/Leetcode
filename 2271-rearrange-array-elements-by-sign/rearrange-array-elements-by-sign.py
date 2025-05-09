class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        positive = [x for x in nums if x > 0]
        negative = [x for x in nums if x < 0]

        result = []
        for i in range(len(positive)):
            result.append(positive[i])
            result.append(negative[i])
        return result
        