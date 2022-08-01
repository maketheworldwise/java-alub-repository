/**
* 메모리: 21524 KB, 시간: 336 ms
* 2022.08.01
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		boolean[] arr = new boolean[n + 1];
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i < n + 1; i++) {
			if(arr[i]) continue;
			
			if(i >= m) sb.append(i).append('\n');
			
			for (int j = i + i; j < n + 1; j += i) {
				arr[j] = true;
			}
		}

		System.out.println(sb);

		scanner.close();
    }
}