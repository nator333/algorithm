/**
 * File              : vc_strncat.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
char *vc_strncat(char *dest, char *src, int n) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    printf("Argument dest is %s\n", dest);
    printf("Argument src is %s\n", src);

    int count = 0;
    while (*dest++) {
        ++count;
    }
    if (!*src) {
        return dest;
    }

    --dest;
    for (int i = 0; i < n; i++, src++, ++dest) {
        *dest = *src;
        ++count;
    }

    *dest = '\0';
    while (count-- != 0) {
        --dest;
    }

    return dest;
}
