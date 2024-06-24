/**
 * File              : vc_putstr_non_printable.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
void vc_putstr_non_printable(char *str) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    printf("Argument is %s\n", str);

    printf("Result is ");
    for (; *str != '\0'; str++) {
        if (*str >= 0 && *str <= 31) {
            int div = (*str / 16) + 48;
            int rem = (*str % 16) + 55;
            putchar('\\');
            putchar(div);
            putchar(rem);

        } else {
            putchar(*str);
        }
    }

    putchar(10);
}
