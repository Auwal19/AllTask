number = int(input("Enter a number: "))

prime = True

if number < 2:
    prime = False

for i in range(2, number):
    if number % i == 0:
        prime = False

if prime:
    print("Prime number")
else:
    print("Not a prime number")
