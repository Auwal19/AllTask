def list_prime_numbers(list_numbers):
    primes = []
    for index in list_numbers:
        if index <= 1:
            continue

        is_prime = True
        for count in range(2, index):
                if index % count == 0:

                    is_prime = False
                    break
                
        if is_prime:
            primes.append(index)

    return primes

list_numbers = list_prime_numbers([5,9,3,6,2,7])
print(list_numbers)


