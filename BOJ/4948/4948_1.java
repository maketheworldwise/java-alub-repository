/**
* 메모리: 18364 KB, 시간: 288 ms
* 2022.08.02
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		// 소수이면 false
		boolean[] isPrime = new boolean[246913];
		for(int i = 2; i <= Math.sqrt(isPrime.length); i++) {
			if(isPrime[i]) continue;
			for(int j = i + i; j <= 246913; j+=i) {
				isPrime[j] = true;
			}
		}
		while(true) {
			int n = scanner.nextInt();
			if(n == 0) break;

			int count = 0;
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!isPrime[i]) count++;
			}
			System.out.println(count);
		}

		scanner.close();
    }
}