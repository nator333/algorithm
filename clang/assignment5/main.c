#include <stdio.h>
#include <string.h>

#include "vc_str_is_alpha.c"
#include "vc_str_is_numeric.c"
#include "vc_str_is_lowercase.c"
#include "vc_str_is_uppercase.c"
#include "vc_str_is_printable.c"
#include "vc_strcat.c"
#include "vc_strncat.c"
#include "vc_strlcat.c"
#include "vc_strlcpy.c"
#include "vc_putstr_non_printable.c"
#include "vc_print_memory.c"

int main() {

    // Exercise00
    char alpha[] = "fF";
    char aAndNum[] = "f23";
    char null[1];
    null[0] = '\0';
    printf("Result is %d\n", vc_str_is_alpha(alpha));
    printf("Result is %d\n", vc_str_is_alpha(aAndNum));
    printf("Result is %d\n", vc_str_is_alpha(null));

    // Exercise01
    char number[] = "123";
    printf("Result is %d\n", vc_str_is_numeric(alpha));
    printf("Result is %d\n", vc_str_is_numeric(number));
    printf("Result is %d\n", vc_str_is_numeric(null));

    // Exercise02
    char lower1[] = "ffF";
    char lower2[] = "f";
    printf("Result is %d\n", vc_str_is_lowercase(lower1));
    printf("Result is %d\n", vc_str_is_lowercase(lower2));
    printf("Result is %d\n", vc_str_is_lowercase(null));

    // Exercise03
    char upper1[] = "ffF";
    char upper2[] = "F";
    printf("Result is %d\n", vc_str_is_uppercase(upper1));
    printf("Result is %d\n", vc_str_is_uppercase(upper2));
    printf("Result is %d\n", vc_str_is_uppercase(null));

    // Exercise04
    char printable1[3];
    printable1[0] = 'a';
    printable1[1] = 2;
    printable1[2] = '\n';
    char printable2[] = "F";
    printf("Result is %d\n", vc_str_is_printable(printable1));
    printf("Result is %d\n", vc_str_is_printable(printable2));
    printf("Result is %d\n", vc_str_is_printable(null));

    // Exercise05
    char strcatDest[5] = "1";
    char strcatSrc[] = "abc";
    printf("Result is %s\n", vc_strcat(strcatDest, strcatSrc));

    // Exercise06
    char strncatDest[2] = "2";
    char strncatSrc[] = "abc";
    printf("Result is %s\n", vc_strncat(strncatDest, strncatSrc, 1));

    // Exercise07
    char strlcatDest1[5] = "";
    char strlcatSrc1[] = "abc";
    printf("Result is %d\n", vc_strlcat(strlcatDest1, strlcatSrc1, 3));
    printf("Result dest is %s\n", strlcatDest1);
    char strlcatDest2[5] = "343";
    char strlcatSrc2[] = "abc";
    printf("Result is %d\n", vc_strlcat(strlcatDest2, strlcatSrc2, 4));
    printf("Result dest is %s\n", strlcatDest2);

    // Exercise08
    char nonPrintable[] = "Hello\nwhat is your favorite food?";
    vc_putstr_non_printable(nonPrintable);
    vc_putstr_non_printable(null);

    // Exercise09
    char printMemory[] = "Salut les aninches c'est cool show non on fait de tructerrible\x00\x2e\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0e\x0f\x1b\x7f";
    vc_print_memory(printMemory);


    return 0;
}