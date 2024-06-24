#include <stdio.h>

/**
 * File              : vc_print_comb2.c
 * Author            : Masa, Kazuya
 * Date              : Wed 6 Jan 2019
 */
void vc_print_comb2()
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    int digits[10] = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};

    int i, j, k, l;
    for (i = 0; i < 10; i++)
    {
        for (j = 0; j < 10; j++)
        {
            for (k = 0; k < 10; k++)
            {
                for (l = j + 1; l < 10; l++)
                {
                    putchar(digits[i]);
                    putchar(digits[j]);
                    putchar(32);
                    putchar(digits[k]);
                    putchar(digits[l]);
                    putchar(44);
                  	putchar(32);
                }
            }
        }
    }
    putchar(10);
};