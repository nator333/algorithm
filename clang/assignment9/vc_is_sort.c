/**
 * File              : vc_is_sort.c
 * Author            : Masa
 * Date              : Fri 14 Feb 2019
 */
int vc_is_sort(int *tab, int length, int(*f)(int, int)) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    int isPositive = 0;
    int isNegative = 0;
    for (int i = 0; i < length - 1; ++i) {
        int sortResult = f(tab[i], tab[i + 1]);
        if (sortResult > 0) {
            isPositive = 1;
        } else if (sortResult < 0) {
            isNegative = 1;
        }
    }
    if (isPositive && isNegative) {
        return 0;
    } else {
        return 1;
    }
}
