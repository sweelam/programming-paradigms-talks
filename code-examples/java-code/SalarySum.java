import java.util.Arrays;

class SalarySum {

  public static void main(String[] args) {
    int[] salaries = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int result = Arrays.stream(salaries).reduce(0, (a, b) -> a + b);

    System.out.println("result = " + result);
  }
}
