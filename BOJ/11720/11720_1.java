/**
* 메모리: 17700 KB, 시간: 212 ms
* 2022.07.27
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nums = scanner.next();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        System.out.println(sum);
        scanner.close();
    }
}