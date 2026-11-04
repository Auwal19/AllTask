pi = 0

for i in range(1, 1000):
    if i % 2 == 1:
        pi = pi + 4 / i
    else:
        pi = pi - 4 / i

print("Pi =", pi)
