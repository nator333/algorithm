#include <stdio.h>
#include <stdlib.h>

/**
 * File              : vc_split_whitespaces.c
 * Author            : Enrique, Masa and Guilherme
 * Date              : Feb 11 2019
 */

#define TRUE 1
#define FALSE 0

int count_words(char *str) {
    int resultCount = 0;
    int wordHasStarted = FALSE;
    for (int j = 0; str[j] != '\0'; ++j) {
        if (str[j] >= 0 && str[j] <= 32) {
            wordHasStarted = FALSE;
        } else {
            if (!wordHasStarted) {
                ++resultCount;
                wordHasStarted = TRUE;
            }
        }
    }

    return resultCount;
}

int count_characters(char *src, int start) {
    int resultCount = 0;

    for (int i = start; src[i] != '\0'; ++i) {
        if (src[i] >= 33 && src[i] <= 126) {
            resultCount++;
        } else {
            break;
        }
    }

    return resultCount;
}


/**
 * The Function returns an Array of Strings that were seppared by spaces and non printable characters.
 * The last String is null, in a way to tell when is the end of the array.
 */
char **vc_split_whitespaces(char *src) {
    printf("======================\n%1$s\n======================\n", __func__);
    printf("Argument is %s\n", src);

    int dest_size = count_words(src);
    char **resultArys = (char **) malloc((dest_size) * sizeof(char *));
    resultArys[dest_size] = '\0';

    int dest_position = 0;
    int start_src = 0;
    while (src[start_src] != '\0') {

        if (src[start_src] >= 0 && src[start_src] <= 32) {
            start_src++;
            continue;
        }

        int string_size = count_characters(src, start_src);
        resultArys[dest_position] = (char *) malloc(string_size * sizeof(char));
        int string_position = 0;
        for (int j = start_src; j < string_size + start_src; j++) {
            resultArys[dest_position][string_position] = src[j];
            string_position++;
        }
        resultArys[dest_position][string_position] = '\0';
        dest_position++;
        start_src = start_src + string_size;
    }

    return resultArys;
}