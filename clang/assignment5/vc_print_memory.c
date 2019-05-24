/**
 * File              : vc_print_memory.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
void vc_print_memory(char *str) {
    printf("======================\n%1$s\n======================\n", __func__);
    printf("Argument is %s\n", str);

    printf("Result is ");
    for (; *str != '\0'; str++) {
        for (int memory = &(*str); memory != 0; memory /=10) {
            putchar(memory % 10);
        }
    }

    putchar(10);
}
