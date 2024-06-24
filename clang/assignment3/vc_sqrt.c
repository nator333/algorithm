#include <stdio.h>

/**
 * File              : vc_sqrt.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_sqrt(int n)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    printf("Argument is %d\n", n);
    for (int i = 0; i <= (n / 2); ++i)
    {
        if (i * i == n)
        {
            return i;
        }
    }

    return 0;
}
