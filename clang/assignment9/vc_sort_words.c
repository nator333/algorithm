/**
 * File              : vc_sort_words.c
 * Author            : Masa
 * Date              : Fri 14 Feb 2019
 */
int compareStr(char *str1, char *str2) {
    for (int i = 0; str1[i] != 0; ++i) {
        if (str1[i] > str2[i]) {
            return -1;
        } else if (str1[i] < str2[i]) {
            return 1;
        }
    }
    return 0;
}


void vc_sort_words(char **words) {
    printf("======================\n%1$s\n======================\n", __func__);
    for (int j = 0; words[j] != 0; ++j) {
        for (int i = 0; words[i + 1] != 0; ++i) {
            if (compareStr(words[i], words[i + 1]) == -1) {
                char *swapAdr = words[i];
                words[i] = words[i + 1];
                words[i + 1] = swapAdr;
            }
        }
    }

}

