/**
* 메모리: 17608 KB, 시간: 216 ms
* 2022.07.26
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = -9999;
        int idx = 0;
        for(int i = 1; i <= 9; i++) {
            int n = scanner.nextInt();
            if(max < n) {
                max = n;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx);
        
        scanner.close();
    }
}