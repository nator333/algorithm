#include <stdio.h>

/**
 * File              : vc_iterative_power.c
 * Author            : Masa, Ayana
 * Date              : Fri 8 Feb 2019
 */
int iterative_power(int n, int power)
{
    printf("==================\n%1$s\n==================\n", __func__);

    printf("Argument is %d & %d\n", n, power);
    if (n < 1)
    {
        return 0;
    }
    
    int result = 1;
    for (int i = 0; i < power; i++)
    {
        result *= n;
    }

    return result;
}
