#include <stdio.h>

/**
 * File              : vc_is_negative.c
 * Author            : Masa, Kazuya
 * Date              : Wed 6 Jan 2019
 */
void vc_is_negative(int n)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    putchar(n < 0 ? 78 : 80);
    putchar(10);
};