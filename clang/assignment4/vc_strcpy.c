#include <stdio.h>

/**
 * File              : vc_strcpy.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
char *vc_strcpy(char *dest, char *src)
{
    printf("==================\n%1$s\n==================\n", __func__);

    int i = 0;
    while (src[i] != '\0')
    {
        dest[i] = src[i];
        i++;
    }
    dest[i] = 0;
    return dest;
}
