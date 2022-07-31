/**
* 메모리: 17992 KB, 시간: 256 ms
* 2022.07.31
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int min = 99999;
        int sum = 0;
        for(int i = m; i <= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(i != 1 && isPrime) {
                sum += i;
                if(min > i) {
                    min = i;
                }
            }
        }
        if(min == 99999) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
        
        scanner.close();
    }
}