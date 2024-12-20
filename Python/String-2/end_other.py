def end_other(a, b):
    shorter = a.lower()
    longer = b.lower()
    if len(a) > len(b):
        shorter = b.lower()
        longer = a.lower()
    for i in range(len(shorter)):
        if longer[len(longer) - len(shorter):] == shorter:
            return True
        else:
            return False
