def combo_string(a, b):
    if len(a) > len(b):
        return b + a + b
    elif len(b) > len(a):
        return a + b + a
