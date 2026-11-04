total_miles = 0
total_gallons = 0

gallons = float(input("Enter gallons used (-1 to end): "))

while gallons != -1:
    miles = float(input("Enter miles driven: "))

    mpg = miles / gallons

    print("Miles per gallon =", mpg)

    total_miles = total_miles + miles
    total_gallons = total_gallons + gallons

    gallons = float(input("Enter gallons used (-1 to end): "))

if total_gallons != 0:
    overall_mpg = total_miles / total_gallons
    print("Overall miles per gallon =", overall_mpg)
