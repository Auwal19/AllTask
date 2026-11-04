for i in range(1, 11):

    a = "*" * i
    b = "*" * (11 - i)
    c = " " * (10 - i) + "*" * i
    d = " " * (i - 1) + "*" * (11 - i)

    print(a, b, c, d)
