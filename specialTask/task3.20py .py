binary = int(input("Enter a binary number: "))

decimal = 0
power = 1

while binary > 0:

    digit = binary % 10

    decimal = decimal + digit * power

    binary = binary // 10

    power = power * 2

print("Decimal =", decimal)
