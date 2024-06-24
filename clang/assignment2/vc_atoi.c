#include <stdio.h>

/**
 * File              : vc_atoi.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */
int vc_atoi(char *str)
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    int sizeOfNums = 0;
    // take the number from char *
    for (; 48 <= *str && *str <= 58; str++)
    {
        sizeOfNums++;
    }

    int multiple = 1;
    str--;
    for (int i = 1; i < sizeOfNums; i++)
    {
        multiple *= 10;
        str--;
    }

    // trancerate from char to int
    // ‘1’ ‘2’ ‘3’
    int resultNum = 0;
    for (int i = 0; i < sizeOfNums; i++)
    {
        resultNum += (str[i] - 48) * multiple;
        multiple /= 10;
    }

    return resultNum;
}