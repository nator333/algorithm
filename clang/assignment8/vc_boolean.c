#include <stdio.h>
#include "vc_boolean.h"

void vc_putstr(char *str) {
    while (*str)
        write(1, str++, 1);
}

t_bool vc_is_even(int n) {
    printf("======================\n%1$s\n======================\n", __func__);
    return EVEN(n);
}

int main(int argc, char **argv) {
    (void) argv;
    if (vc_is_even(argc - 1))
        vc_putstr(EVEN_MSG);
    else
        vc_putstr(ODD_MSG);
    return SUCCESS;
}