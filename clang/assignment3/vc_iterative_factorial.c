#include <stdio.h>

/**
 * File              : vc_iterative_factorial.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_iterative_factorial(int n)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    printf("Argument is %d\n", n);
    if (n < 1)
    {
        return 0;
    }

    int result = 1;
    for (int i = n; i > 0; i--)
    {
        result *= i;
    }

    return result;
}
