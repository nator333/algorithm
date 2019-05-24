#include <stdio.h>

/**
 * File              : vc_print_numbers.c
 * Author            : Masa, Kazuya
 * Date              : Wed 6 Jan 2019
 */
void vc_print_numbers()
{
    printf("==================\n%1$s\n==================\n", __func__);

    char num;
    for (num = 48; num < 58; num++) putchar(num);
    putchar(10);
    
};