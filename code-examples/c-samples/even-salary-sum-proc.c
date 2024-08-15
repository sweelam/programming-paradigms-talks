#include <stdio.h>

int SalaryEvenSum(int Salaries[], int N) {
  int result = 0;
  int i;
  for (i = 0; i < N; i++) {
    if (Salaries[i] % 2 == 0) {
      result += Salaries[i];
    }
  }

  return result;
}

int main() {
  int Salaries[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int N = sizeof(Salaries) / sizeof(Salaries[0]);

  int result = SalaryEvenSum(Salaries, N);
  printf("Sum of even salaries is %d", result);
  return 0;
}
