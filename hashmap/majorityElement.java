import java.util.HashMap;
import java.util.Set;

class majorityElement {

  public static void majority(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      // if (map.containsKey(arr[i])) {
      // map.put(arr[i], map.get(arr[i]) + 1);
      // } else {
      // map.put(arr[i], 1);
      // }
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    Set<Integer> keyset = map.keySet();
    for (int key : keyset) {
      System.out.println(key + " " + map.get(key));

      if (map.get(key) > arr.length / 3) {
        System.out.println(map.get(key));
        System.out.println(key);
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5, 1, 3, 5, 1, 1 };

    majority(arr);

  }
}