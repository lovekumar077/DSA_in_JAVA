import java.util.*;

public class fixedVowel {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = scanner.nextLine();

    int count = countVowelPermutations(s);
    System.out.println("Count of vowel permutations: " + count);
  }

  public static int countVowelPermutations(String s) {
    Map<Character, Integer> consonantCounts = new HashMap<>();

    for (char c : s.toCharArray()) {
      if (!isVowel(c)) {
        consonantCounts.put(c, consonantCounts.getOrDefault(c, 0) + 1);
      }
    }

    int consonantFactorial = 1;
    for (int count : consonantCounts.values()) {
      consonantFactorial *= factorial(count);
    }

    return factorial(s.length()) / consonantFactorial;
  }

  public static boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
