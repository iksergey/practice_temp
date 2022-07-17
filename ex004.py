'''
# Показать числа, у которых
 последняя цифра делится на 4

'''

n = int(input("n = "))
index = 0
while index <= n:
    if (index % 10) % 4 == 0:
        print(index, end=" ")
    index += 2
