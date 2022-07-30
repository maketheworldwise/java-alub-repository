/**
* 메모리: 18172 KB, 시간: 236 ms
* 2022.07.30
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = scanner.nextInt();
		for(int i = 0; i < t; i++) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			int n = scanner.nextInt();

			if (n % h == 0) {
				sb.append(h * 100 + n / h).append("\n");
			}
			else {
				sb.append((n % h) * 100 + (n / h) + 1).append("\n");
			}
		}
		System.out.println(sb);
		scanner.close();
    }
}