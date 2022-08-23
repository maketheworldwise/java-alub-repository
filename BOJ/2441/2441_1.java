/**
* 메모리: 18448 KB, 시간: 416 ms
* 2022.08.24
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}