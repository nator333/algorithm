#include <stdio.h>

/**
 * File              : vc_div_mod.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */
void vc_div_mod(int a, int b, int *div, int *mod)
{
    printf("==================\n%1$s\n==================\n", __func__);

    *div = a / b;
    *mod = a % b;

    printf("A: %1$d\n", a);
    printf("B: %1$d\n", b);
    printf("DIV: %1$d\n", *div);
    printf("MOD: %1$d\n", *mod);
}