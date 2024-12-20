def make_chocolate(small, big, goal):
    if goal >= 5:
        if goal // 5 >= big:
            goal -= big * 5
        else:
            goal %= 5
    if goal <= small:
        return goal
    return -1
