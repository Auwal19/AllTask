
user_name = input("Enter your name: ")
total =  0.0
cost = 0.

while "yes":
    product = (input("Enter product: "))
    quantity = int(input(f"Enter quantity of {product}: "))
    price = int(input(f"Enter price {product}: "))

    cost = price * quantity
    total += cost

    more = input("would you like to add more items? (yes/no): ")

    if more.lower() == 'no':
        break

     print = input(f"The total price is: {total}")

    
    
