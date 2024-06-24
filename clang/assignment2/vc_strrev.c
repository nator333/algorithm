#include <stdio.h>

/**
 * File              : vc_strrev.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */
char *vc_strrev(char *str)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    int resultCount = 0;
    while (*str != '\0')
    {
        str++;
        resultCount++;
    }


    for (int i = resultCount; i > 0; i--)
    {
        str--;
    }

    char revStr[resultCount + 1];
    int j = 0;
    for (int i = resultCount; i > 0; i--)
    {
        revStr[j] = str[i - 1];
        j++;
    }
    revStr[resultCount] = '\0';

    return revStr;
}