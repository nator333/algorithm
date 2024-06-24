#include <stdio.h>

/**
 * File              : vc_strcapitalize.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
char *vc_strcapitalize(char *str)
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

    if (*str >= 65 && *str <= 90)
    {
        result[0] = *str;
    }
    else
    {
        result[0] = *str ^ 32;
    }
    ++str;

    for (int i = 1; *str; str++)
    {
        if (*str >= 65 && *str <= 90)
        {
            result[i] = *str | 32;
        }
        else
        {
            result[i] = *str;
        }
        ++i;
    }

    printf("%s\n", result);

    return &result;
}
