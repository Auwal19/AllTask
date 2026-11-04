def add_number(first_number, second_number):
  return first_number + second_number

def subtract_number(first_number, second_number):
    result = first_number - second_number
    return result
def multiply_number(first_number, second_number):
    result = first_number * second_number
    return result
def division_number(first_number, second_number):
    result = first_number / second_number
    return result
def exponential(first_number, power):
    result = first_number ** power
    return result

result = add_number(30, 35)
result_one = subtract_number(50, 35)
result_two = multiply_number(25, 25)
result_three = division_number(100, 50)
result_four = exponential(8, 3)

print("30 + 35 =",result)
print("50 - 35 =",result_one)
print("25 * 25 =",result_two)
print("100 / 5 =",result_three)
print("8 ** 3 =",result_four)

