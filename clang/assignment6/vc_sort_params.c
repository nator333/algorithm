/**
 * File              : vc_sort_params.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
#include <stdio.h>

int main(int argc, char *argv[])
{
    int i;

    for (i=1;i<argc;i++) {
        printf("%s", argv[i]);
        if (i < argc - 1) {
            printf(" ");
        }
    }
    putchar('\n');
}