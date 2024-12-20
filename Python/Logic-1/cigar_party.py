def cigar_party(cigars, is_weekend):
    if (60 >= cigars >= 40) and is_weekend == False:
        return True
    elif cigars >= 40 and is_weekend == True:
        return True
    else:
        return False
