def pos_neg(a, b, negative):
    if (a * b < 0) and negative == False:
        return True
    if (a == -1 and b == -1) and negative == True:
        return True
    if a * b == 1 and negative == True:
        return False
    elif (a * b > 0) and negative == True:
        return True
    else:
        return False
