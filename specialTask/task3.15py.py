e = 0
factorial = 1

for i in range(10):
    if i > 0:
        factorial = factorial * i

    e = e + 1 / factorial

print("e =", e)
