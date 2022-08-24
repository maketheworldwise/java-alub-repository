/**
* 메모리: 25076 KB, 시간: 640 ms
* 2022.08.24
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
    }
}