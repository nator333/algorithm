#include <stdlib.h>

int *vc_range(int min, int max) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    printf("Argument is min:%d max:%d \n", min , max);

    if (max < min) {
        return 0;
    }

    int size = max - min;
    int *result = malloc(size * sizeof(int));

    int count = min;
    for (int i = 0; i < size; ++i) {
        result[i] = count++;
    }
    return result;
}