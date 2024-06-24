#include <stdio.h>

/**
 * File              : vc_putstr.c
 * Author            : Masa, Kazuya
 * Date              : Thu 7 Feb 2019
 */
void vc_putstr(char *str)
{
    printf("==================\n%1$s\n==================\n", __func__);

    do{
        putchar(*str);
    } while (*str++ != '\0');

    putchar(10);
}
