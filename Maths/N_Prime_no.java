class N_Prime_no {

  public static void N_primeNumber(int n) {
    for (int i = 0; i <= n; i++) {
      if (check(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean check(int n) {

    if (n == 0 || n == 1) {
      return false;
    }

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    int n = 100;
    N_primeNumber(n);

  }
}