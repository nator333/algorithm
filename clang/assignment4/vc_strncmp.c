#include <stdio.h>

/**
 * File              : vc_strncmp.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_strncmp(char *s1, char *s2, unsigned int n)
{
    printf("==================\n%1$s\n==================\n", __func__);
    int i = 0;
    for (; s1[i] && s2[i]; ++i)
    {
        if (i == n - 1)
        {
            break;
        }
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
