#include <stdio.h>

/**
 * File              : vc_strlen.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */
int vc_strlen(char *str)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    int resultCount = 0;
    while (*str != '\0')
    {
        *str++;
        resultCount++;
    }

    return resultCount;
}
