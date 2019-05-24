/**
 * File              : vc_any.c
 * Author            : Masa
 * Date              : Fri 14 Feb 2019
 */

int vc_any(char **tab, int(*f)(char*)) {
    printf("======================\n%1$s\n======================\n", __func__);
    for (int i = 0; tab[i] != '\0'; ++i) {
        printf("Argument is %s\n", tab[i]);
        if (f(tab[i])) {
            return 1;
        }
    }
    return 0;
}
