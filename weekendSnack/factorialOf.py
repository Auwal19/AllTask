import math
def factorial_of(number: int) -> int:
    if number < 0:
        return 0
    return math.factorial(number)

user_input = int(input("Enter an integer: "))

result = factorial_of(user_input)
print("Factorial:", result)
