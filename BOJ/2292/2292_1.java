/**
* 메모리: 17692 KB, 시간: 208 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int start = 1;
        int end = 1;
        int room = 1;
        while(true) {
            if(n == 1) break;
            end = end + 6 * room++;
            if(start < n && n <= end) break;
        }
        System.out.println(room);
        scanner.close();
    }
}