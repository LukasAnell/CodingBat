def lucky_sum(a, b, c):
    arr = [a, b, c]
    sum = 0
    for num in arr:
        if num == 13:
            break
        sum += num
    return sum
