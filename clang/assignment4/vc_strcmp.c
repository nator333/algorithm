#include <stdio.h>

/**
 * File              : vc_strcmp.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_strcmp(char *s1, char *s2)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    int i = 0;
    for (; s1[i] && s2[i]; ++i)
    {
        if (s1[i] == s2[i])
            continue;
        else
            break;
    }

    if (s1[i] == s2[i])
        return 0;

    if (s1[i] < s2[i])
        return -1;
    return 1;
}
