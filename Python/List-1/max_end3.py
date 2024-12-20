def max_end3(nums):
    if nums[0] > nums[len(nums) - 1]:
        array = [nums[0], nums[0], nums[0]]
    else:
        array = [nums[len(nums) - 1], nums[len(nums) - 1], nums[len(nums) - 1]]
    return array
