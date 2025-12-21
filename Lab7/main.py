def lengthOfEachSubArray(size):
    arr = [None] * size
    for i in range(size):
        length = 0
        for j in range(size):
            if j >= i and j <= size - i - 1:
                length += 1
        arr[i] = [""] * length
    return arr

def printMatrix(arr, symbol1, symbol2, size, file):
    print("\nРезультат матриці:")
    with open(file, "w", encoding="utf-8") as writer:
        for i in range(size):
            current_symbol = symbol1 if (i + 1) % 2 != 0 else symbol2
            
            index_j = 0
            for j in range(size):
                if j >= i and j <= size - i - 1:
                    arr[i][index_j] = current_symbol
                    writer.write(arr[i][index_j] + " ")
                    print(arr[i][index_j], end=" ")
                    index_j += 1
                else:
                    writer.write("  ")
                    print("  ", end="")
            print()
            writer.write("\n")

if __name__ == '__main__':
    size = int(input("Введіть розмір матриці: "))
    s1 = input("Введіть символ для НЕПАРНИХ рядків: ")
    s2 = input("Введіть символ для ПАРНИХ рядків: ")

    if len(s1) != 1 or len(s2) != 1:
        print("Введіть по одному символу!")
    else:
        arr = lengthOfEachSubArray(size)
        file_name = "matrix_output.txt"
        printMatrix(arr, s1, s2, size, file_name)