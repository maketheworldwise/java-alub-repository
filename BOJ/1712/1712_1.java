/**
* 메모리: 17640 KB, 시간: 208 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int result = 0;
        if(c - b == 0) {
            result = -1;        
        } else {
            int n = a / (c - b);
            if(n < 0) result = -1;
            else result = n + 1;
        }

        System.out.println(result);
        scanner.close();
    }
}