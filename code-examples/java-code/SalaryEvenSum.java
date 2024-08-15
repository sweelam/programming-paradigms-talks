public class SalaryEvenSum {
  static int SalaryEvenSum(int Salaries[], int N) {
    int result = 0;
    int i;
    for (i = 0; i < N; i++) {
      if (Salaries[i] % 2 == 0) {
        result += Salaries[i];
      }
    }

    return result;
  }

  public static void main(String[] args) {

    System.out.println(SalaryEvenSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
  }
}
