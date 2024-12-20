def count_evens(nums):
    evens = 0
    for i in range(len(nums)):
        if nums[i] % 2 == 0:
            evens += 1
    return evens
