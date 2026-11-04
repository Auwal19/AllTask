def divide(numerator: int, denominator: int) -> float:
    if denominator == 0:
        return 0.0
    return numerator / denominator

num1 = int(input("Enter numerator: "))
num2 = int(input("Enter denominator: "))

result = divide(num1, num2)
print("Quotient:", result)
