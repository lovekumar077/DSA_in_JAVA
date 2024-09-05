public class printSubArray {

  public static void printsubarray(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      int start = i;
      int totalSubArray = 0;

      for (int j = i; j < nums.length; j++) {
        int end = j;

        for (int k = start; k < end; k++) {
          System.out.println(nums[k] + " ");
          totalSubArray++;
        }

      }
      System.out.println();
      System.out.println(totalSubArray + "total");
    }
  }

  public static void main(String[] args) {
    int nums[] = { 2, 4, 6, 8, 20 };

    printsubarray(nums);

    System.out.println(nums.length);

  }

}
