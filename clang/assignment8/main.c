#include <stdio.h>
#include "vc_abs.h"
#include "vc_param_to_tab.c"
#include "vc_boolean.h"
#include "vc_show_tab.c"
#include "vc_hexdump.c"

int main() {

    // Exercise01
    printf("Result is %d\n", ABS(0));
    printf("Result is %d\n", ABS(4));
    printf("Result is %d\n", ABS(-5));

    // Exercise02 -> vc_point.c

    // Exercise03
    char *dan = "Dan Masa";
    t_stock *stock = vc_param_to_tab(2, dan);
    printf("Result is t_stock.size_param:%d\n", stock->size_param);
    printf("Result is t_stock.str:%s\n", stock->str);
    printf("Result is t_stock.copy:%s\n", stock->copy);
    for (int i = 0; i < 2; ++i) {
        printf("Result is t_stock.words[%d]:%s\n", i, (stock->words)[i]);
    }

    // Exercise04
    vc_show_tab(stock);

    // Exercise05
    vc_hexdump();

    return 0;
}