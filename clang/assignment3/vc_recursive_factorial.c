#include <stdio.h>

/**
 * File              : vc_recursive_factorial.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_recursive_factorial(int n)
{

    if (n <= 0)
    {
        printf("==================\n%1$s\n==================\n", __func__);
        return 0;
    }

    if (n == 1)
    {
        printf("==================\n%1$s\n==================\n", __func__);
        return 1;
    }

    return vc_recursive_factorial(n - 1) * n;
}
