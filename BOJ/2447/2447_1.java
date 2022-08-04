/**
* 메모리: 52704 KB, 시간: 472 ms
* 2022.08.04
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static char[][] arr;

    public static void fillStar(int x, int y, int n, boolean isBlank) {
		// 공백일 경우
		if(isBlank) {
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; j++) {
					arr[x][y] = 32;
				}
			}
			return;
		}
		// 더 이상 쪼갤 수 없는 블럭일 경우
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		// n = 27 일 경우, 한 블록의 사이즈는 9
		// n = 9 일 경우, 한 블록의 사이즈는 3
		// n 일 경우, 한 블록의 사이즈는 n / 3
		int size = n / 3;

		// 9등분된 상태에서 (1,1) 까지의 블록 수는 (0,0), (0,1), (0,2), (1,0) 총 4개
		// 즉, 5번째 블록일 때는 가운데 가장 큰 비어있는 공간을 의미
		int count = 0;
		for(int i = x; i < x + n; i+=size) {
			for(int j = y; j < y + n; j+=size) {
				count++;
				// (1,1)인 경우
				if(count == 5) {
					fillStar(i, j, size, true);
				} else {
					fillStar(i, j, size, false);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		arr = new char[n][n];

		// '*' 모두 채우기
		fillStar(0, 0, n, false);

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					sb.append(" ");
					continue;
				}
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);

		scanner.close();
	}
}