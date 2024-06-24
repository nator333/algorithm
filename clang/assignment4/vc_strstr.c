#include <stdio.h>

/**
 * File              : vc_strstr.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
char *vc_strstr(char *str, char *to_find)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    if (*to_find == '\0')
    {
        return str;
    }

    int count = 0;
    for (char i = *to_find; i != '\0'; i = *++to_find)
    {
        for (char j = *str; j != '\0'; j = *++str)
        {
            if (i == j)
            {
                if (*++to_find == '\0')
                {
                    for (int k = count; k > 0; k--)
                    {
                        *--str;
                    }
                    return str;
                }
                goto NEXT;
            }
            else
            {
                for (int k = count; k >= 0; k--)
                {
                    *--to_find;
                }
                count = 0;
            }
        }
    NEXT:
        *--to_find;
        *++str;
        ++count;
    }
}
