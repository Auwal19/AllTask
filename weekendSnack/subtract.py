def subtract(first: int, second: int) -> int:
    return abs(first - second)

num1 = int(input("Enter first integer: "))
num2 = int(input("Enter second integer: "))

result = subtract(num1, num2)
print("Positive Difference:", result)
