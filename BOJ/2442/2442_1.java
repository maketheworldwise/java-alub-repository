/**
* 메모리: 19216 KB, 시간: 436 ms
* 2022.08.24
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		scanner.close();
    }
}