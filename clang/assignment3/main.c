#include "vc_iterative_factorial.c"
#include "vc_recursive_factorial.c"
#include "vc_iterative_power.c"
#include "vc_recursive_power.c"
#include "vc_fibonacci.c"
#include "vc_sqrt.c"
#include "vc_is_prime.c"
#include "vc_find_next_prime.c"

int main()
{
    printf("======================\n🦐: %1$s\n======================\n", __func__);

    // Exercise 00
    printf("Result is %d\n", vc_iterative_factorial(5));
    printf("Result is %d\n", vc_iterative_factorial(-1));
    // Exercise 01
    printf("Result is %d\n", vc_recursive_factorial(5));
    printf("Result is %d\n", vc_recursive_factorial(-1));
    // Exercise 02
    printf("Result is %d\n", iterative_power(3, 2));
    printf("Result is %d\n", iterative_power(0, 2));
    // Exercise 03
    printf("Argument is %d & %d\n", 3, 2);
    printf("Result is %d\n", vc_recursive_power(3, 2));
    printf("Argument is %d & %d\n", 0, 2);
    printf("Result is %d\n", vc_recursive_power(0, 2));
    // Exercise 04
    printf("Result is %d\n", vc_fibonacci(0));
    printf("Result is %d\n", vc_fibonacci(1));

    // Exercise 05
    printf("Result is %d\n", vc_sqrt(0));
    printf("Result is %d\n", vc_sqrt(4));

    // Exercise 06
    printf("Result is %d\n", vc_is_prime(0));
    printf("Result is %d\n", vc_is_prime(4));
    printf("Result is %d\n", vc_is_prime(17));

    // Exercise 07
    printf("Result is %d\n", vc_find_next_prime(1));
    printf("Result is %d\n", vc_find_next_prime(2));
    printf("Result is %d\n", vc_find_next_prime(18));

    return 0;
}
