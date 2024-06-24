#include <stdio.h>

static int digits2[10] = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};

/**
 * File              : vc_print_comb2.c
 * Author            : Masa, Kazuya
 * Date              : Wed 6 Jan 2019
 */
void vc_print_comb2()
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    int i, j, k, l;
    for (i = 0; i < 10; i++)
    {
        for (j = 0; j < 10; j++)
        {
            for (k = 0; k < 10; k++)
            {
                for (l = j + 1; l < 10; l++)
                {
                    putchar(digits2[i]);
                    putchar(digits2[j]);
                    putchar(32);
                    putchar(digits2[k]);
                    putchar(digits2[l]);
                    putchar(44);
                  	putchar(32);
                }
            }
        }
    }
    putchar(10);
};