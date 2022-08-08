/**
* 메모리: 17808 KB, 시간: 220 ms
* 2022.08.08
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expected = scanner.nextInt();
        int t = scanner.nextInt();
        int calculated = 0;
        for(int i = 0; i < t; i++) {
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            calculated += price * count;
        }
        String result = "No";
        if(expected == calculated) {
            result = "Yes";
        }
        System.out.println(result);
        scanner.close();
    }
}