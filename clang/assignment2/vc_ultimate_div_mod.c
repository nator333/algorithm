#include <stdio.h>

/**
 * File              : vc_ultimate_div_mod.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */
void vc_ultimate_div_mod(int *a, int *b)
{
    printf("==================\n%1$s\n==================\n", __func__);

    printf("A: %1$d\n", *a);
    printf("B: %1$d\n", *b);

    int div = *a / *b;
    int mod = *a % *b;
    *a = div;
    *b = mod;

    printf("DIV: %1$d\n", *a);
    printf("MOD: %1$d\n", *b);
}
