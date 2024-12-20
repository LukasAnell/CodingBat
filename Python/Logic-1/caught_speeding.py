def caught_speeding(speed, is_birthday):
    if speed <= 60 and is_birthday == False:
        return 0
    elif speed <= 65 and is_birthday == True:
        return 0
    elif (80 >= speed >= 61) and is_birthday == False:
        return 1
    elif (86 >= speed >= 66) and is_birthday == True:
        return 1
    elif (speed >= 81) and is_birthday == False:
        return 2
    elif (speed >= 86) and is_birthday == True:
        return 2
