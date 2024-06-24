#include <stdlib.h>

/**
 * File              : vc_convert_base.c
 * Author            : Enrique, Masa and Guilherme
 * Date              : Mon 11 Feb 2019
 */

static int convertCharToNum(char *nbrRef, int base) {
    int length = 0;
    for (int i = 0; nbrRef[i] != '\0'; ++i) {
        ++length;
    }

    int convertedNum = 0;
    for (int i = 0; i < length; ++i) {
        int multipleNum = 1;
        for (int j = i + 1; j < length; ++j) {
            multipleNum *= base;
        }
        int subNum = 0;
        if (65 <= nbrRef[i] && nbrRef[i] <= 90) {
            subNum = 55;
        } else if (97 <= nbrRef[i] && nbrRef[i] <= 122) {
            subNum = 87;
        } else {
            subNum = 48;
        }
        convertedNum += multipleNum * (nbrRef[i] - subNum);
    }

    return convertedNum;
}

char *vc_convert_base(char *nbr, char *base_from, char *base_to) {
    printf("======================\n🦐: %1$s\n======================\n", __func__);
    printf("Argument argc is nbr:%s, base_from:%s, base_to:%s\n", nbr, base_from, base_to);

    // 1. Fix nbr to decimal
    int nbrNum = convertCharToNum(nbr, convertCharToNum(base_from, 10));
    // 2. Convert base_to to num
    int baseToNum = convertCharToNum(base_to, 10);
    // 3. Get the digits
    int digitLength = 0;
    for (int i = nbrNum; i != 0; i /= baseToNum) {
        ++digitLength;
    }
    char *oppositeCharAry = malloc(digitLength * sizeof(char));
    oppositeCharAry[digitLength] = '\0';

    // 4. Convert to another base num
    for (int j = 0, i = nbrNum; i != 0; i /= baseToNum, j++) {
        oppositeCharAry[j] = (i % baseToNum) + 48;
    }

    // 5. Converse value
    char *result = malloc(digitLength * sizeof(char));
    result[digitLength] = '\0';
    int reverseIndex = digitLength - 1;
    for (int k = 0; k < digitLength; ++k) {
        result[k] = oppositeCharAry[reverseIndex--];
    }

    free(oppositeCharAry);

    return result;
}
  
