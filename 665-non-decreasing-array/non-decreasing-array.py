class Solution:
    def checkPossibility(self, nums):
        count = 0  # number of modifications

        for i in range(1, len(nums)):
            if nums[i] < nums[i - 1]:
                if count == 1:
                    return False
                count += 1
                if i == 1 or nums[i] >= nums[i - 2]:
                    nums[i - 1] = nums[i]  # lower the previous element
                else:
                    nums[i] = nums[i - 1]  # raise the current element
        return True


def main():
    sol = Solution()

    nums1 = [4, 2, 3]
    nums2 = [4, 2, 1]

    print(sol.checkPossibility(nums1))  # True
    print(sol.checkPossibility(nums2))  # False

if __name__ == "__main__":
    main()
