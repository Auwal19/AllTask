credit_card_number = 4388576018402626

digits = [2, 8, 5, 6, 1, 4, 2, 2]

double_digits = [d* 2 for d in digits]
print("Doubled digits: ", double_digits)

total_sum = sum(double_digits)

print("Final sum:      ", total_sum)
