/**
* 메모리: 18444 KB, 시간: 236 ms
* 2022.07.29
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int t = 2;

		// 대각선 그룹 찾기
		int total = 0;
		while (x > total) {
			total += t - 1;
			t++;
		}

		int diff = total - x + 1;
		if(t % 2 == 0) { // 짝수일 경우 정방향
			System.out.println((t - diff - 1) + "/" + diff);
		} else { // 홀수일 경우 역방향
			System.out.println(diff + "/" + (t - diff -1));
		}

		scanner.close();
    }
}