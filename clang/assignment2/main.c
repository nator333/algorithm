#include "vc_pt.c"
#include "vc_ultimate_pt.c"
#include "vc_swap.c"
#include "vc_div_mod.c"
#include "vc_ultimate_div_mod.c"
#include "vc_putstr.c"
#include "vc_strlen.c"
#include "vc_strrev.c"
#include "vc_atoi.c"
#include "vc_sort_int_table.c"

int main()
{
    printf("======================\n🦐: %1$s\n======================\n", __func__);

    // Exercise 00
    int num = 0;
    int *num_ref = &num;
    vc_pt(num_ref);

    // Exercise 01
    num = 0;
    int *num_ref1 = &num;
    int **num_ref2 = &num_ref1;
    int ***num_ref3 = &num_ref2;
    int ****num_ref4 = &num_ref3;
    int *****num_ref5 = &num_ref4;
    int ******num_ref6 = &num_ref5;
    int *******num_ref7 = &num_ref6;
    int ********num_ref8 = &num_ref7;
    int *********num_ref9 = &num_ref8;
    vc_ultimate_pt(num_ref9);

    // Exercise 02
    int num_a = 0;
    int num_b = 100;
    vc_swap(&num_a, &num_b);

    // Exercise 03
    int div_a = 5;
    int div_b = 2;
    int div = 99;
    int mod = 999;
    int *div_ref = &div;
    int *mod_ref = &mod;
    vc_div_mod(div_a, div_b, div_ref, mod_ref);
    printf("DIV: %1$d\n", div);
    printf("MOD: %1$d\n", mod);

    // Exercise 04
    div_a = 5;
    div_b = 2;
    div_ref = &div_a;
    mod_ref = &div_b;
    vc_ultimate_div_mod(div_ref, mod_ref);
    printf("DIV: %1$d\n", div_a);
    printf("MOD: %1$d\n", div_b);

    // Exercise 05
    char string[] = "Hello!";
    vc_putstr(string);

    // Exercise 06
    printf("Length of %1$s is %2$d\n", string, vc_strlen(string));

    // Exercise 07
    printf("Reverse of %1$s is %2$s\n", string, vc_strrev(string));

    // Exercise 08
    char numStr[] = "123Hello!";
    printf("%1$d\n", vc_atoi(numStr));

    // Exercise 09
    int intTable[3] = {2, 3, 1};
    vc_sort_int_table(intTable, 3);

    return 0;
}