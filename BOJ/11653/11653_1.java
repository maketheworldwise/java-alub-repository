/**
* 메모리: 17792 KB, 시간: 280 ms
* 2022.08.01
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double nSqrt = Math.sqrt(n);
        
		StringBuilder sb = new StringBuilder();
		int m = 2;
		while(m <= nSqrt && m != 1) {
			if(n % m == 0) {
				sb.append(m).append("\n");
				n /= m;
			} else {
				m++;
			}
		}
		if(n > 1) {
			sb.append(n).append("\n");
		}

		System.out.println(sb);

		scanner.close();
    }
}