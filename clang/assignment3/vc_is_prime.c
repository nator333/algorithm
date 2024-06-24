#include <stdio.h>

/**
 * File              : vc_is_prime.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_is_prime(int n)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    if (n < 2)
    {
        return 0;
    }

    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            return 0;
        }
    }

    return 1;
}
