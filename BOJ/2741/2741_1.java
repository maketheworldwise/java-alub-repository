/**
* 메모리: 33328 KB, 시간: 1172 ms
* 2022.07.25
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}