def sum13(nums):
    sum = 0
    was13 = False
    for num in nums:
        if was13:
            was13 = False
            continue
        if num == 13:
            was13 = True
            continue
        else:
            sum += num
    return sum
