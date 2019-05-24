#include <stdlib.h>

/**
 * File              : vc_concat_params.c
 * Author            : Enrique, Masa and Guilherme
 * Date              : Mon 11 Feb 2019
 */
char *vc_concat_params(int argc, char **argv) {
    printf("======================\n%1$s\n======================\n", __func__);
    printf("Argument argc is %d\n", argc);

    // 1. Calculate total length
    int length = 0;
    for (int i = 0; i < argc; ++i) {
        char *argumentChar = argv[i];
        for (int j = 0; argumentChar[j] != '\0'; ++j) {
            ++length;
        }
    }

    // 2. Create result value
    // Take extra length for new line
    length += argc - 1;
    char *result = malloc(length * sizeof(char));
    result[length] = '\0';
    int totalIndex = 0;

    for (int i = 0; i < argc; ++i) {
        char *argumentChar = argv[i];
        // Insert new line
        if (i != 0){
            result[totalIndex] = '\n';
            ++totalIndex;
        }
        // Copy char
        for (int j = 0; argumentChar[j] != '\0'; ++j, ++totalIndex) {
            result[totalIndex] = argumentChar[j];
        }

    }

    return result;
}
  
