#include <stdlib.h>

/**
 * File              : vc_map.c
 * Author            : Masa
 * Date              : Fri 14 Feb 2019
 */

int *vc_map(int *tab, int length, int(*f)(int)) {
    printf("======================\n%1$s\n======================\n", __func__);
    int *result = (int *) malloc(length * sizeof(int *));
    for (int i = 0; i < length; ++i) {
        result[i] = f(tab[i]);
    }

    return result;
}