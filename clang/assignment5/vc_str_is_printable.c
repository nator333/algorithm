/**
 * File              : vc_str_is_printable.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
int vc_str_is_printable(char *str) {
    printf("======================\n%1$s\n======================\n", __func__);
    printf("Argument is %s\n", str);
    if (!*str) {
        return 1;
    }

    for (; *str; str++) {
        if ((*str >= 0 && *str <= 32)) {
            return 0;
        }
    }
    return 1;
}
