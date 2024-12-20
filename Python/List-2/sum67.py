def sum67(nums):
    sum = 0
    counting = True
    for i in nums:
        if i == 6:
            counting = False
        if counting:
            sum += i
        if i == 7:
            counting = True
    return sum
