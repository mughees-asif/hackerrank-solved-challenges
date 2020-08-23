
import java.util.Scanner;

public class Solution {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = scanner.nextInt();
        int[] breadLoaves = new int[numOfPeople];

        int sum = 0;
        for (int i = 0; i < breadLoaves.length; i++) {
            breadLoaves[i] = scanner.nextInt();
            sum += breadLoaves[i];
        }
        
        if (sum % 2 != 0) {
            System.out.println("NO");
        } else {
            int result = 0;
            for (int i = 0; i < breadLoaves.length; i++) {
                if (breadLoaves[i] % 2 != 0) {
                    breadLoaves[i] += 1;
                    breadLoaves[i + 1] += 1;
                    result += 2;
                }
            }
            System.out.println(result);
        }
    }
}
