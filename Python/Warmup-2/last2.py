def last2(str):
    count = 0
    lastTwo = str[-2:]
    for i in range(len(str) - 2):
        if str[i:i + 2] == lastTwo:
            count += 1

    return count
