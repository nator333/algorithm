#include <stdio.h>

/**
 * File              : vc_print_reverse_alhabet.c
 * Author            : Masa, Kazuya
 * Date              : Wed 6 Jan 2019
 */
void vc_print_reverse_alhabet()
{
    printf("==================\n%1$s\n==================\n", __func__);

    char ch;
    for (ch = 'z'; ch >= 'a'; ch--) putchar(ch);
    putchar(10);
};