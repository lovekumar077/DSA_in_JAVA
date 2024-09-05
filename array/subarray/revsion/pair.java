package revsion;

public class pair {

  public static void printPair(int num[]) {
    int totalpair = 0;

    for (int i = 0; i < num.length; i++) {
      int curr = num[i];

      for (int j = i + 1; j < num.length; j++) {
        System.out.println("(" + curr + " " + num[j] + ")");
        totalpair++;

      }

    }
    System.out.println(totalpair);
  }

  public static void main(String[] args) {
    int[] input1 = { 2, 3, 6, 6, 8 };

    printPair(input1);

  }

}
