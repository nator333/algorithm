#include <stdio.h>

/**
 * File              : vc_fibonacci.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int vc_fibonacci(int n)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    if (n < 0)
    {
        return -1;
    }

    if (n == 0) return 0;
    if (n == 1) return 1;
    if (n == 2) return 1;
    

    return vc_fibonacci(n - 1) + vc_fibonacci(n - 2);
}
