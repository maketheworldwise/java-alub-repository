/**
* 메모리: 17652 KB, 시간: 228 ms
* 2022.07.25
* by Alub
*/
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        scanner.close();
    }
}