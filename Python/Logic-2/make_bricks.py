def make_bricks(small, big, goal):
    if big * 5 + small < goal:
        return False
    else:
        return goal % 5 <= small
