/**
 * File              : vc_point.c
 * Author            : Danilo, Masa
 * Date              : Thu 14 Feb 2019
 */

#include <stdio.h>
#include "vc_point.h"

void set_point(t_point *point)
{
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    point->x = 86;
    point->y = 89;
}

int main(void)
{
    // Exercise02
    t_point point;
    set_point(&point);

    printf("Result is %d\n", point.x);
    printf("Result is %d\n", point.y);

    return 0;
}