def factor_of(number: int) -> int:
    if number <= 0:
        return 0
    count = 0
    for i in range(1, number + 1):
        if number % i == 0:
            count += 1
    return count

user_input = int(input("Enter an integer: "))

result = factor_of(user_input)
print("Number of factors:", result)
