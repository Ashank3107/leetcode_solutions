class Solution:
    def canBeIncreasing(self, nums):
        def is_strictly_increasing(arr):
            return all(arr[i] < arr[i+1] for i in range(len(arr) - 1))

        for i in range(len(nums)):
            temp = nums[:i] + nums[i+1:]
            if is_strictly_increasing(temp):
                return True
        return False


def main():
    sol = Solution()

    nums1 = [1, 2, 10, 5, 7]
    nums2 = [2, 3, 1, 2]
    nums3 = [1, 1, 1]

    print(sol.canBeIncreasing(nums1))  # True
    print(sol.canBeIncreasing(nums2))  # False
    print(sol.canBeIncreasing(nums3))  # False

if __name__ == "__main__":
    main()
