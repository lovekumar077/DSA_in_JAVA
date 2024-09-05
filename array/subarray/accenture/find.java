package accenture;

import java.util.Scanner;

public class find {

  static int findPosition(int arr[], int n) {
    int i = 0;
    int lsum = 0;
    int rsum = 0;
    int start = 0;
    int end = n;

    for (i = 0; i < n; i++) {
      rsum += arr[i];
    }
    for (int j = 0; j < n; j++) {
      rsum -= arr[j];

      if (lsum == rsum) {
        return j;

      }
      lsum += arr[j];

    }
    return -1;
  }

  public static void main(String[] args) {
    // int arr[] = { 2, 3, 4, 1, 4, 5 };
    // int arr[] = { -8, 4, 2, 9, -9, 1, 6 };
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of elements");
    int m = sc.nextInt();
    int arr[] = new int[m];

    for (int i = 0; i < m; i++) {
      arr[i] = sc.nextInt();

    }
    int size = arr.length;
    System.out.println(findPosition(arr, size));
  }

}
