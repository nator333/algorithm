#include <stdlib.h>
#include "vc_stock.h"
#include "vc_split_whitespaces.c"
#include "vc_strdup.c"

/**
 * File              : vc_param_to_tab.c
 * Author            : Danilo, Masa
 * Date              : Thu 14 Feb 2019
 */
struct s_stock *vc_param_to_tab(int ac, char **av) {
    printf("======================\n%1$s\n======================\n", __func__);
    printf("Argument is ac:%d, av: %s\n", ac, av);
    t_stock *newStock = malloc(sizeof(t_stock));

    newStock->size_param = ac;
    newStock->str = av;
    newStock->copy = vc_strdup(av);
    newStock->words = vc_split_whitespaces(av);

    return newStock;
}