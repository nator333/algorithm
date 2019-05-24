#include <stdio.h>
#include "vc_foreach.h"
#include "vc_foreach.c"
#include "vc_map.h"
#include "vc_map.c"
#include "vc_any.h"
#include "vc_any.c"
#include "vc_count_if.h"
#include "vc_count_if.c"
#include "vc_is_sort.h"
#include "vc_is_sort.c"
#include "vc_sort_words.h"
#include "vc_sort_words.c"

void accept(int num) {
    // Remove the last digit and recur
    if (num / 10) accept(num / 10);
    // Print the last digit
    putchar(num % 10 + '0');
    putchar(10);
}

int apply(int num) {
    return num * num;
}

int test(char *str) {
    int isStartCapital = 0;
    if (65 <= str[0] && str[0] <= 90) {
        isStartCapital = 1;
    }
    return isStartCapital;
}

int compareInt(int a, int b) {
    int result = 0;
    if (a > b) {
        result = -1;
    } else if (a < b) {
        result = 1;
    }
    return result;
}


int main() {

    // Exercise01
    int length = 3;
    int nums[3] = {0, 1, 2};
    vc_foreach(nums, length, accept);

    // Exercise02
    int *appliedNums = vc_map(nums, length, apply);
    for (int i = 0; i < length; ++i) {
        accept(appliedNums[i]);
    }

    // Exercise03
    char string1[] = "juan";
    char string2[] = "masa";
    char string3[] = "Masa";
    char *strAry1[3] = {string1, string2, 0};
    char *strAry2[3] = {string1, string3, 0};
    printf("Result is %d\n", vc_any(strAry1, test));
    printf("Result is %d\n", vc_any(strAry2, test));

    // Exercise04
    printf("Result is %d\n", vc_count_if(strAry1, test));
    printf("Result is %d\n", vc_count_if(strAry2, test));

    // Exercise05
    int sortedNums1[3] = {0, 1, 2};
    int sortedNums2[3] = {0, 1, 1};
    int unsortedNums[3] = {1, 3, 2};
    printf("Result is %d\n", vc_is_sort(sortedNums1, length, compareInt));
    printf("Result is %d\n", vc_is_sort(sortedNums2, length, compareInt));
    printf("Result is %d\n", vc_is_sort(unsortedNums, length, compareInt));

    // Exercise07
    char string4[] = "ddd";
    char string5[] = "ccc";
    char string6[] = "aaab";
    char string7[] = "aaa";
    char *strAry3[5] = {string4, string5, string6, string7, 0};
    vc_sort_words(strAry3);
    for (int i = 0; strAry3[i] != 0; ++i) {
        printf("Result is %s\n", strAry3[i]);
    }


    return 0;
}
