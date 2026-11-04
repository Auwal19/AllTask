def is_prime_number(number: int) -> bool:
    if number < 2:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
    return True

user_input = int(input("Enter an integer: "))

result = is_prime_number(user_input)
print("Is Prime:", result)
