favorite_color = "blue"
for index in range(3):
    guess = input("Guess your favourite color:  ")

    if guess == favorite_color:
        print("correct")
        break
    elif guess == ("green"):
        print("close")
    else:
        print("wrong")
