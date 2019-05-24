#include <stdio.h>

/**
 * File              : vc_recursive_power.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_recursive_power(int n, int power)
{
    if (n < 1 || power < 1)
    {
        printf("==================\n%1$s\n==================\n", __func__);
        return 0;
    }

    if (power == 1)
    {
        printf("==================\n%1$s\n==================\n", __func__);
        return n;
    }

    return n * vc_recursive_power(n, power - 1);
}
