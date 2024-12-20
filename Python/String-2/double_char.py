def double_char(str):
    output = ""
    for i in range(len(str)):
        output = output + str[i] + str[i]
    return output
