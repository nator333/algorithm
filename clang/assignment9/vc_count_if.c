/**
 * File              : vc_count_if.c
 * Author            : Masa
 * Date              : Fri 14 Feb 2019
 */

int vc_count_if(char **tab, int(*f)(char*)) {
    printf("======================\n%1$s\n======================\n", __func__);
    int resultCount = 0;
    for (int i = 0; tab[i] != '\0'; ++i) {
        printf("Argument is %s\n", tab[i]);
        if (f(tab[i])) {
            ++resultCount;
        }
    }
    return resultCount;
}
