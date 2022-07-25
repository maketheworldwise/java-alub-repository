/**
* 메모리: 17688 KB, 시간: 216 ms
* 2022.07.25
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < t-1-i; j++) {
                sb.append(" ");
            }
            for(int k = 0; k <= i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        scanner.close();
    }
}