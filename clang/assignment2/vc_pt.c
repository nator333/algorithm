#include <stdio.h>

/**
 * File              : vc_pt.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */
void vc_pt(int *n)
{
    printf("==================\n%1$s\n==================\n", __func__);
    printf("Before: %d\n", *n);
    *n = 77;
    printf("After: %d\n", *n);
}