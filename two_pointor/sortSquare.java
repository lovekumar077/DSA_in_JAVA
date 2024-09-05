import java.util.*;

public class sortSquare {

  public static void swap(int arr[], int n1, int n2) {
    int temp = arr[n1];
    arr[n1] = arr[n2];
    arr[n2] = temp;

  }

  static void reverse(int arr[]) {
    int i = 0;
    int j = arr.length - 1;

    while (i < j) {
      swap(arr, i, j);
      i++;
      j--;
    }
  }

  public static int[] sortsquares(int arr[]) {
    int n = arr.length;
    int left = 0;
    int right = n - 1;
    int k = 0;

    int[] ans = new int[n];

    while (left < right) {

      // bgger number square is added to ans[]
      if (Math.abs(arr[left]) > Math.abs(arr[right])) {
        ans[k++] = arr[left] * arr[left];

        left++;
      } else {
        ans[k++] = arr[right] * arr[right];
        right--;
      }
    }
    reverse(arr);
    return ans;
  }

  public static void main(String[] args) {
    int a[] = { -10, -3, 5, -2, 4, 6 };

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();

    int result[] = sortsquares(a);

    for (int i = 0; i < a.length; i++) {
      System.out.print(result[i] + " ");
    }

  }
}