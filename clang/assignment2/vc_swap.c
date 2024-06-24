#include <stdio.h>

/**
 * File              : vc_swap.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */
void vc_swap(int *a, int *b)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);
    printf("a Before: %1$d\n", *a);
    printf("b Before: %1$d\n", *b);
    
    int tempNum = *b;
    *b = *a;
    *a = tempNum;

    printf("a After: %1$d\n", *a);
    printf("b After: %1$d\n", *b);

}