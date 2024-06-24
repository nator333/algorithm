#include <stdio.h>

/**
 * File              : vc_putnbr.c
 * Author            : Masa, Kazuya
 * Date              : Wed 6 Jan 2019
 */
void vc_putnbr(int nb)
{
    printf("==================\n%1$s\n==================\n", __func__);

    int nbTemp = nb;
    int count = 0;
    for (; nbTemp != 0; nbTemp = nbTemp / 10)
    {
        count++;
    }

    nbTemp = nb;
    int reverseNum = 0;
    for (; nbTemp != 0; nbTemp = nbTemp / 10)
    {
        int x = 1;
        for (int i = 1; i < count; i++)
        {
            x *= 10;
        }

        reverseNum += (nbTemp % 10) * x;
        count--;
    }

    nbTemp = reverseNum;
    for (; nbTemp != 0; nbTemp = nbTemp / 10)
    {
        putchar((nbTemp % 10) + 48);
    }

    putchar(10);
};