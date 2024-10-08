package accenture;

public class equlilibrium {
  static int equilibriumPoint(int a[], int n) {

    // Here we define two pointers to the array -> start =
    // 0, end = n-1 Two variables to take care of sum ->
    // left_sum = 0, right_sum = 0
    int i = 0, start = 0, end = n - 1, left_sum = 0,
        right_sum = 0;

    for (i = 0; i < n; i++) {

      // if the equilibrium element is found our start
      // will be equal to end variable and left_sum will
      // be equal right_sum => return the equilibrium
      // element
      if (start == end && right_sum == left_sum)
        return start;

      // if start is equal to end variable but left_sum is
      // not equal right_sum => no equilibrium element
      // return -1
      if (start == end)
        return -1;

      // if left_sum > right_sum => add the current end
      // element to the right_sum and decrement end
      if (left_sum > right_sum) {
        right_sum += a[end];
        end--;
      }

      // if right_sum < left_sum => add the current start
      // element to the left_sum and increment start
      else if (right_sum > left_sum) {
        left_sum += a[start];
        start++;
      }
      /*
       * if left_sum is equal right_sum but start is not
       * equal to end => we are still in the middle of
       * algorithm even though we found that left_sum is
       * equal right_sum we haven't got that one required
       * equilibrium element (So, in this case add the
       * current end element to the right_sum and
       * decrement end (or) add the current start element
       * to the left_sum and increment start, to make our
       * algorithm continue further)
       */

      else {
        right_sum += a[end];
        end--;
      }
    }

    // When there is only one element in array our algorithm
    // exits without entering for loop So we can check if our
    // functions enters the loop if not we can directly
    // return the value as answer
    if (i == 0) {
      return a[0];
    }
    return -1;
  }

  // Driver code
  public static void main(String[] args) {
    // int arr[] = { 2, 3, 4, 1, 4, 5 };
    int arr[] = { 7, 3, 1, 9, 8, 1, 2 };
    int size = arr.length;
    System.out.println(equilibriumPoint(arr, size));
  }

}
