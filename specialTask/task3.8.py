total = 0
product = 1

for i in range(4):
    number = int(input("Enter a number: "))

    total = total + number
    product = product * number

    if i == 0:
        smallest = number
        largest = number
    else:
        if number < smallest:
            smallest = number

        if number > largest:
            largest = number

average = total / 4

print("Sum =", total)
print("Average =", average)
print("Product =", product)
print("Smallest =", smallest)
print("Largest =", largest)
