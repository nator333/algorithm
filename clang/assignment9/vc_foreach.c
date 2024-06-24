/**
 * File              : vc_foreach.c
 * Author            : Masa
 * Date              : Fri 14 Feb 2019
 */

void vc_foreach(int *tab, int length, void(*f)(int)){
    printf("======================\n%1$s\n======================\n", __func__);
    for (int i = 0; i < length; ++i) {
        f(tab[i]);
    }
}