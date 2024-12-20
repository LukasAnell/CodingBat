def count_code(str):
    total = 0
    for i in range(len(str) - 1):
        if str[i:i + 2] == "co" and str[i + 3:i + 4] == "e":
            total += 1
    return total
