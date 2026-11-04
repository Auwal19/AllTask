numbers = [2, 4, 6, 8, 10]

double = [number ** 2 for number in numbers]
print(double)

numbers1 = [3, 8, 11, 14, 17, 20, 25, 30]
even = [number for number in numbers1 if number % 2 == 0]
print(even)

odd = [number for number in numbers1 if number % 2 != 0]
print(odd)

number2 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
odd = [number **2 for number in number2 if number % 2 != 0]
print(odd)

number3 = [4, 12, 7, 20, 15, 3, 25]
greater = [number for number in number3 if number > 10]
print(greater)

number4 = [4, 12, 7, 20, 15, 3, 25]
add = [number +5 for number in number4]
print(add)

numbers5 = [4, 12, 7, 20, 15, 3, 25, 30, 18]
odd = [number for number in numbers5 if number % 2 == 0 and number >= 10]
print(odd)

numbers6 = [10, 15, 20, 30, 35, 45, 50, 60]
odd = [number for number in numbers6 if number % 3 == 0 and number % 5 == 0]
print(odd)

numbers7 = [2, 4, 6, 8, 10]
odd = [number for number in numbers6 if number % 3 == 0 and number % 5 == 0]
