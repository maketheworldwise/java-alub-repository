/**
* 메모리: 17756 KB, 시간: 212 ms
* 2022.07.25
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int target = num;
        int count = 0;
        while(true) {
            int first = num / 10;
            int second = num % 10;
            int sum = first + second;
            num = second * 10 + sum % 10;

            count++;
            if(target == num) break;
        }
        System.out.println(count);
        scanner.close();
    }
}