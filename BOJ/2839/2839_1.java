/**
* 메모리: 17776 KB, 시간: 216 ms
* 2022.07.31
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bags = 0;
        while(true) {
            if(n % 5 == 0) {
                bags += n / 5;
                break;
            }
            
            n -= 3;
            bags++;
            
            if(n < 0) {
                bags = -1;
                break;
            }
        }
        System.out.println(bags);
        scanner.close();
    }
}