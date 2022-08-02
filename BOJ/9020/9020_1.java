/**
* 메모리: 49816 KB, 시간: 680 ms
* 2022.08.02
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 소수일 경우 false
		boolean[] isPrime = new boolean[20001];
		for(int i = 2; i < Math.sqrt(isPrime.length); i++) {
			if(isPrime[i]) continue;
			for(int j = i + i; j < isPrime.length; j+=i) {
				isPrime[j] = true;
			}
		}

		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = scanner.nextInt();
		for(int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int diffMin = n - 2;
			String result = "";
			for(int j = 1; j <= n / 2; j++) {
				if(!isPrime[j] && !isPrime[n-j]) {
					if(diffMin >= n-j) {
						diffMin = n-j;
						result = j + " " + (n-j);
					}
				}
			}
			sb.append(result).append("\n");
		}

		System.out.println(sb);
		scanner.close();
    }
}