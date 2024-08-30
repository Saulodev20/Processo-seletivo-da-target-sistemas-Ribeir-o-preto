def is_fibonacci_number(n):
    a, b = 0, 1
    while b < n:
        a, b = b, a + b
    return b == n or n == 0

# Adicionado Número 
num = int(input("Informe um número: "))

if is_fibonacci_number(num):
    print(f"O número {num} pertence à sequência de Fibonacci.")
else:
    print(f"O número {num} não pertence à sequência de Fibonacci.")
