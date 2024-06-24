#include <stdlib.h>

/**
 * File              : vc_strdup.c
 * Author            : Gillherme, Masa, Enrique
 * Date              : Mon 11 Feb 2019
 */
char *vc_strdup(char *str) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    printf("Argument is %s\n", str);

    int length = 0;
    for (int i = 0; str[i] != '\0'; ++i) {
        ++length;
    }


    char *result = malloc(length * sizeof(char));
    for (int i = 0; str[i] != '\0'; ++i) {
        result[i] = str[i];
    }

    result[length] = '\0';

    return result;
}
  
