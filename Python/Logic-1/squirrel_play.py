def squirrel_play(temp, is_summer):
    if (90 >= temp >= 60) and is_summer == False:
        return True
    elif (100 >= temp >= 60) and is_summer == True:
        return True
    else:
        return False
