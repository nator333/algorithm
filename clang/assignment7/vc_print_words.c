#include <stdlib.h>

/**
 * File              : vc_print_words.c
 * Author            : Enrique, Masa and Guilherme
 * Date              : Mon 11 Feb 2019
 */
void vc_print_words(char **words) {
    printf("======================\n%1$s\n======================\n", __func__);
    for (int i = 0; words[i] != '\0'; ++i) {
        char *word = words[i];
        for (int j = 0; word[j] != '\0'; ++j) {
            putchar(word[j]);
        }
        putchar('\n');
    }

}