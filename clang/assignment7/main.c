#include <stdio.h>

#include "vc_strdup.c"
#include "vc_range.c"
#include "vc_ultimate_range.c"
#include "vc_concat_params.c"
#include "vc_split_whitespaces.c"
#include "vc_print_words.c"
#include "vc_convert_base.c"
#include "vc_split.c"

int main() {

    // Exercise00
    char strdupArg[] = "HelloWorld!";
    char *strdupResult = vc_strdup(strdupArg);
    printf("Result is %s\n", strdupResult);
    free(strdupResult);

    // Exercise01
    int *ints = vc_range(0, 5);
    for (int i = 0; i < 5; ++i) {
        printf("%d", ints[i]);
    }
    putchar(10);

    // Exercise02
    int ultimateRangeAry[6] = {0, 0, 0, 0, 0, 0};
    // ultimateRangeArr -> const
    int size = vc_ultimate_range((int**)ultimateRangeAry, 9, 15);
    printf("Result is %d\n", size);
    for (int k = 0; k < size; ++k) {
        printf("%d\n", ultimateRangeAry[k]);
    }

    // Exercise03
    char concatParam1[] = "Hello";
    char concatParam2[] = "World!";
    char concatParam3[] = "Babe!";
    char *concatParams1[] = {concatParam1, concatParam2};
    char *concatParams2[] = {concatParam1, concatParam2, concatParam3};
    printf("Result is %s\n", vc_concat_params(2, concatParams1));
    printf("Result is %s\n", vc_concat_params(3, concatParams2));

    // Exercise04
    char splitWhites[] = "Hello \t\n  World ! !  \n1";
    char **splitAryRef = vc_split_whitespaces(splitWhites);

    for (int i = 0; splitAryRef[i] != '\0'; ++i) {
        char *word = splitAryRef[i];
        for (int j = 0; word[j] != '\0'; ++j) {
            putchar(word[j]);
        }
        putchar('\n');
    }

    // Exercise05
    char word1[] = "Hello";
    char word2[] = "World!";
    char word3[] = "Babe!";
    char *wordNull = '\0';
    char *words1[] = {word1, word2, wordNull};
    char *words2[] = {word1, word2, word3, wordNull};
    vc_print_words(words1);
    vc_print_words(words2);

    // Exercise06
    printf("Result is %s\n", vc_convert_base("0a", "16", "10")); // -> 10
    printf("Result is %s\n", vc_convert_base("Aa", "16", "2")); // -> 16 * 10 + 10 = 10101010(2)
    printf("Result is %s\n", vc_convert_base("1010", "2", "10")); // -> 10

    // Exercise07
    char src[] = "HELLO THEWORLD";
    char charset[] = "W ";
    char ** src2 = vc_split(src,charset);
    vc_print_words(src2);

    return 0;
}