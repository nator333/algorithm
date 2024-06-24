#include "vc_strcpy.c"
#include "vc_strncpy.c"
#include "vc_strncmp.c"
#include "vc_strcmp.c"
#include "vc_strupcase.c"
#include "vc_strstr.c"
#include "vc_strlowcase.c"
#include "vc_strcapitalize.c"
#include "string.h"

int main()
{
    printf("======================\n🦐: %1$s\n======================\n", __func__);

    // Exercise 00
    char *mainSrc = "Hello!";
    char mainDest[] = "000000";
    printf("Result is %s\n", vc_strcpy(mainDest, mainSrc));

    // Exercise 01
    printf("Result is %s\n", vc_strncpy(mainDest, mainSrc, 3));

    // Exercise 02
    char string[] = "ab3ab";
    char toFind[] = "ab";
    printf("Result is %s\n", vc_strstr(string, toFind));

    // Exercise 03
    char s1[] = "ab3";
    char s2[] = "ab4";
    printf("Result is %d\n", vc_strcmp(s1, s2));

    // Exercise 04
    char s3[] = "ab3";
    char s4[] = "ab4";
    printf("Result is %d\n", vc_strncmp(s3, s4, 1));

    // Exercise 05
    char lowerS[] = "HelLo";
    printf("Out of method: Result is %s\n", vc_strupcase(lowerS));

    // Exercise 06
    char upperS[] = "HelLo";
    printf("Result is %s\n", vc_strlowcase(upperS));

    // Exercise 06
    char capitalS1[] = "heLlo";
    char capitalS2[] = "Hello";
    printf("Result is %s\n", vc_strcapitalize(capitalS1));
    printf("Result is %s\n", vc_strcapitalize(capitalS2));

    return 0;
}
