word = input("Enter a word: ")

reverse = ""

for letter in word:
    reverse = letter + reverse

print("Reversed word:", reverse)
