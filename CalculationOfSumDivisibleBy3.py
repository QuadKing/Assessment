sum_of_integers = 0

for num in range(1, 30):
    if num % 3 == 0:
        sum_of_integers += num

print("Sum of integers between 1 and 30 divisible by 3:", sum_of_integers)
