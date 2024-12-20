def centered_average(nums):
    sum = 0
    largest = max(nums)
    smallest = min(nums)
    for i in range(len(nums)):
        sum = sum + nums[i]
    return (sum - largest - smallest) / (len(nums) - 2)
