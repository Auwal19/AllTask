numbers = [12, 5, 8, 21, 3, 16, 10]

print(numbers[0])
print(numbers[0], numbers[6])
numbers[2] = (20)
print(numbers)
numbers.append(25)
print(numbers)
numbers.remove(21)
print(numbers)
length = len(numbers)
print(length)

largest = numbers[0]

for number in numbers:
    if number > largest:
        largest = number

print(largest)

smallest = numbers[0]

for number in numbers:
    if number < smallest:
        smallest = number

print(smallest)

for number in numbers:
    if number % 2 == 0:
        print(number)

numbers.sort(reverse=False)
print(numbers)

        
