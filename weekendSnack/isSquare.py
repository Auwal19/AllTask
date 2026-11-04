import math
def is_square(number: int) -> bool:
    if number < 0:
        return False
    root = math.isqrt(number)
    return root * root == number

user_input = int(input("Enter an integer: "))

result = is_square(user_input)
print("Square is:", result)
