/**
* 메모리: 55624 KB, 시간: 884 ms
* 2022.08.09
* by Alub
*/
import java.util.Scanner;

public class Main {

	public static final Scanner scanner = new Scanner(System.in);
    
	public static int k; // 이동 횟수
	public static StringBuilder sb = new StringBuilder();

	public static void hanoi(int n, String start, String to, String assist) {
		if(n == 1) {
			k++;
			sb.append(start).append(" ").append(to).append("\n");
			return;
		}
		hanoi(n-1, start, assist, to);
		sb.append(start).append(" ").append(to).append("\n");
		hanoi(n-1, assist, to, start);
		k++;
	}

    public static void main(String[] args) {
		int n = scanner.nextInt();

		// n개의 원판을 1번 장대에서 3번 장대로 이동시키고 2번 장대를 보조로 사용
		hanoi(n, "1", "3", "2");

		System.out.println(k);;
		System.out.println(sb);
		scanner.close();
	}
}