#include <stdio.h>

/**
 * File              : vc_sort_int_table.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */

void dispNumAry(char *str, int *tab, int size)
{
    printf("%s: ", str);
    for (int i = 0; i < size; i++)
    {
        printf("%d", tab[i]);
    }
    printf("\n");
}

void vc_sort_int_table(int *tab, int size)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    dispNumAry("Before", tab, size);

    int tempNum = 0;
    for (int i = 0; i < size; i++)
    {
        for (int j = size - 1; j > 0; j--)
        {
            if (tab[j] < tab[j - 1])
            {
                tempNum = tab[j];
                tab[j] = tab[j - 1];
                tab[j - 1] = tempNum;
            }
        }
    }

    dispNumAry("After", tab, size);
}
