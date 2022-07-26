/**
* 메모리: 17736 KB, 시간: 204 ms
* 2022.07.26
* by Alub
*/
import java.util.Scanner;

public class Main {
	public boolean solution(int n) {

		while(n > 99) {

			int first = n % 10;
			int second = (n / 10) % 10;
			int diff = second - first;

			n /= 10;

			int third = (n / 10) % 10;
			if(third != second + diff) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(main.solution(i)) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}