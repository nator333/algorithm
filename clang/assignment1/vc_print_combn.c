#include <stdio.h>

/**
 * File              : vc_print_combn.c
 * Author            : Masa, Kazuya
 * Date              : Wed 6 Jan 2019
 */
void vc_print_combn(int n)
{
    printf("==================\n%1$s\n==================\n", __func__);
    int digits[10] = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};

    int array[n];

    // init
    for (int keta = 0; keta <= n; keta++)
    {
        array[keta] = keta;
    }

    for (int i = n; i <= 10; i++)
    {
        for (int i = 0; i < n; i++)
        {
            putchar(array[i] + 48);
        }
        putchar(44);
        putchar(32);
        array[n - 1]++;
    }
};