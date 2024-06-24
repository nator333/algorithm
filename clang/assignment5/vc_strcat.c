/**
 * File              : vc_strcat.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
char *vc_strcat(char *dest, char *src) {
    printf("======================\n%1$s\n======================\n", __func__);
    printf("Argument dest is %s\n", dest);
    printf("Argument src is %s\n", src);

    int count = 0;
    while (*dest++) {
        ++count;
    }
    if (!*src) {
        return dest;
    }

    for (--dest; *src; src++, ++dest) {
        *dest = *src;
        ++count;
    }

    *dest = '\0';
    while (count-- != 0) {
        --dest;
    }

    return dest;
}
