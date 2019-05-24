/**
 * File              : vc_show_tab.c
 * Author            : Danilo, Masa
 * Date              : Thu 14 Feb 2019
 */

void printNum(int num) {
    // Remove the last digit and recur
    if (num / 10) printNum(num / 10);
    // Print the last digit
    putchar(num % 10 + '0');
    putchar(10);
}

void printChar(char *string, t_bool needsNewLine) {
    for (; *string != '\0'; ++string) {
        putchar(*string);
    }

    if (needsNewLine) {
        putchar(10);
    }
}

void printCharAry(char **strAry) {
    for (; *strAry != '\0'; ++strAry) {
        printChar(*strAry, TRUE);
    }
}

void vc_show_tab(struct s_stock *stock) {
    printf("======================\n%1$s\n======================\n", __func__);
    printChar("stock->size_param: ", FALSE);
    printNum(stock->size_param);
    printChar("stock->str: ", FALSE);
    printChar(stock->str, TRUE);
    printChar("stock->words: ", TRUE);
    printCharAry(stock->words);
}