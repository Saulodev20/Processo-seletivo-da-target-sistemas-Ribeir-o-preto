def count_a_in_string(s):
    count = s.lower().count('a')
    return count

# Adicionado a String
string = input("Informe uma string: ")

count = count_a_in_string(string)
print(f"A letra 'a' aparece {count} vezes na string.")
