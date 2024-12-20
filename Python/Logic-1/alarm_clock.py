def alarm_clock(day, vacation):
    if (5 >= day >= 1) and vacation == False:
        return "7:00"
    elif (5 >= day >= 1) and vacation == True:
        return "10:00"
    elif (day == 6 or day == 0) and vacation == False:
        return "10:00"
    elif (day == 6 or day == 0) and vacation == True:
        return "off"
