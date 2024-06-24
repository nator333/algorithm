/**
 * File              : vc_strlcpy.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
unsigned int vc_strlcpy(char *dest, char *src, unsigned int size) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    printf("Argument dest is %s\n", dest);
    printf("Argument src is %s\n", src);

    unsigned int countA = 0;
    while (*dest++) {
        ++countA;
    }
    if (!*src) {
        return countA;
    }

    unsigned int countB = 0;
    --dest;
    for (int i = 0; i < size; i++, src++, ++dest) {
        *dest = *src;
        ++countB;
    }

    countB += countA;
    *dest = '\0';
    unsigned int result = countB - countA;
    while (countB-- != 0) {
        --dest;
    }

    return result;
}
