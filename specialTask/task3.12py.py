number = int(input("Enter a 5-digit number: "))

original = number
reverse = 0

for i in range(5):
    digit = number % 10
    reverse = reverse * 10 + digit
    number = number // 10

if original == reverse:
    print("Palindrome")
else:
    print("Not a palindrome")
