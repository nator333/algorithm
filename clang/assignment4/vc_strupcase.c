#include <stdio.h>

/**
 * File              : vc_strupcase.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
char *vc_strupcase(char *str)
{
    printf("==================\n%1$s\n==================\n", __func__);

    int length = 1;
    while (*str++ != '\0')
    {
        ++length;
    }

    for (int j = 0; j < length; j++)
    {
        --str;
    }

    char result[length];
    result[length - 1] = '\0';
    for (int i = 0; *str; str++)
    {
        if (*str >= 65 && *str <= 90)
        {
            result[i] = *str;
        }
        else
        {
            result[i] = *str ^ 32;
        }
        ++i;
    }

    printf("In method: Result is %s\n", result);

    return &result;
}
