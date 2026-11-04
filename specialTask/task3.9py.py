number = int(input("Enter a 5-digit number: "))

for i in range(5):
    digit = number // 10 ** (4 - i)
    print(digit, end=" ")

    number = number % 10 ** (4 - i)
