# Recursion
def calculate_recur(n):
    if n <= 1: return n
    return calculate_recur(n - 1) + 3 ** (n - 1)


# Format to Hex str
def format_hex_str(n):
    if n == 0: return "0"
    return hex(n).lstrip('0x')


# Test
testMsg = "Given arg is %s\n  The result is %s"
for i in range(9): print(testMsg % (i, format_hex_str(calculate_recur(i))))
