public class sortEvenParity {

  public static void swap(int arr[], int n1, int n2) {
    int temp = arr[n1];
    arr[n1] = arr[n2];
    arr[n2] = temp;

  }

  public static void sortEvenOddParity(int arr[]) {
    int n = arr.length;
    int left = 0;
    int right = n - 1;

    while (left < right) {
      if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
        swap(arr, left, right);
        left++;
        right--;
      }

      if (arr[left] % 2 == 0) {
        left++;
      }
      if (arr[right] % 2 == 1) {
        right--;
      }
    }
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();

    sortEvenOddParity(a);

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

  }

}
