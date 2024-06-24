#include "vc_print_alphabet.c"
#include "vc_print_reverse_alphabet.c"
#include "vc_print_numbers.c"
#include "vc_is_negative.c"
#include "vc_print_comb.c"
#include "vc_print_comb2.c"
#include "vc_putnbr.c"
#include "vc_print_combn.c"

int main()
{
    printf("======================\n%1$s\n======================\n", __func__);
    vc_print_alphabet();
    vc_print_reverse_alhabet();
    vc_print_numbers();
    vc_is_negative(-1);
    vc_is_negative(1);
    vc_print_comb();
    vc_print_comb2();
    vc_putnbr(123);
    vc_print_combn(3);

    return 0;
}