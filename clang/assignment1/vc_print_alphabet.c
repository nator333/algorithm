#include <stdio.h>

/**
 * File              : vc_print_alphabet.c
 * Author            : Masa, Kazuya
 * Date              : Wed 6 Jan 2019
 */
void vc_print_alphabet()
{
    printf("==================\n🦐: %1$s\n==================\n", __func__);

    char ch;
    for (ch = 'a'; ch <= 'z'; ch++) putchar(ch);
    putchar(10);
};