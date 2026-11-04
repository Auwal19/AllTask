def is_palindrome(number: int) -> bool:
    text = str(abs(number))
    return text == text[::-1]

user_input = int(input("Enter a 5-digit integer: "))

result = is_palindrome(user_input)
print("Is Palindrome:", result)
