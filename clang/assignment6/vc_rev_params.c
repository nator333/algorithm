/**
 * File              : vc_rev_params.c
 * Author            : Masa, Mihail
 * Date              : Mon 11 Feb 2019
 */
#include <stdio.h>

int main(int argc, char *argv[]) {
    int i;

    for (i = (argc - 1); i > 0; i--) {
        printf("%s", argv[i]);
        if (i > 0) {
            printf(" ");
        }
    }
    putchar('\n');
}