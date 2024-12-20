def near_hundred(n):
    if n < 90:
        return False
    elif abs(100 - abs(n)) <= 10 or abs(200 - abs(n)) <= 10:
        return True
    else:
        return False
