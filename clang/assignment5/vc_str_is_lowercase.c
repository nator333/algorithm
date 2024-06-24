/**
 * File              : vc_str_is_lowercase.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
int vc_str_is_lowercase(char *str) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    printf("Argument is %s\n", str);
    if (!*str) {
        return 1;
    }

    for (; *str; str++) {
        if (*str >= 64 && *str <= 90) {
            return 0;
        }
    }
    return 1;
}
