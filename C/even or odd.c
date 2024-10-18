#include <stdio.h>

int main(void) {
  int n; // declaring the required variable

  printf("Enter an integer:\n");  // taking input from the user
  scanf("%d", &n);  // storing the user input in a variable

  if (n % 2 == 0) {  // checking whether the entered number gives 0 remainder when divided by 2
    printf("%d is an even number!\n", n);
  }
  else {
    printf("%d is an odd number!\n", n);
  }
   
  return 0; // end of main
}
