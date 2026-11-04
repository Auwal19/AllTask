numbers = [45, 12, 89, 3, 27, 12, 67]

numbers.sort(reverse=True)
print(numbers)

new_list = sorted(numbers)
print(new_list)

new_numbers = []

for number in numbers:
    if number not in new_numbers:
        new_numbers.append(number)

new_numbers.sort()

print(new_numbers)

word = ["Zainab", "Ali", "David", "Bola"]
word.sort(key=str.lower)
print(word)

word2 = ["banana", "cat", "elephant", "dog", "ant"]
word2.sort(key=len)
print(word2)
