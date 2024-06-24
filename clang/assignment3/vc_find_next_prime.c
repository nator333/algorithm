#include <stdio.h>

/**
 * File              : vc_find_next_prime.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_find_next_prime(int n)
{
    if (n < 2)
    {
        printf("==================\n🦐: %1$s\n==================\n", __func__);
        return 0;
    }

    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            return vc_find_next_prime(n + 1);
        }
    }

    printf("==================\n🦐: %1$s\n==================\n", __func__);
    return n;
}
