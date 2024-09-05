class tileproblems {

  static int tileProblem(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    // vn = tileProblem(n-1)
    // hn = tileProblem(n-2)

    int vn = 0; // vertical
    vn = vn + tileProblem(n - 1);

    int hn = 0; // horizonatal
    hn = hn + tileProblem(n - 2);

    return vn + hn;
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(tileProblem(n));

  }
}