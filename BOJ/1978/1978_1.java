/**
* 메모리: 17844 KB, 시간: 256 ms
* 2022.07.31
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        int count = 0;
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            boolean isPrime = true;
            for(int j = 2; j < n; j++) {
                if(n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(n != 1 && isPrime) ++count;
        }
        
        System.out.println(count);
        scanner.close();
    }
}