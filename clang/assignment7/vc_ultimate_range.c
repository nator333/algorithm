#include <stdlib.h>

/**
 * File              : vc_ultimate_range.c
 * Author            : Enrique, Masa and Guilherme
 * Date              : Feb 11 2019
 */
int vc_ultimate_range(int **range, int min, int max) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    int i;
    if (min >= max) {
        return 0;
    }
    int size = max - min;
    int *new_array = (int *) malloc(size * sizeof(int));
    for (i = 0; i < size; i++) {
        new_array[i] = min + i;
    }
    *range = new_array;
    return size;
}