import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println("Output: " + splitStrings(s));
    }

    public static int splitStrings(String s) {
        int n = s.length();
        int res = n;
        for (int i = 1; i < n; i++) {
            String a = s.substring(0, i);
            String b = s.substring(i);
            Set<Character> set = new HashSet<Character>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            int x = set.size();
            res = Math.min(res, n - x);
        }
        return res;
    }
}