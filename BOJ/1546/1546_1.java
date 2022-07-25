/**
* 메모리: 18448 KB, 시간: 260 ms
* 2022.07.26
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = -9999;
        for(int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            arr[i] = score;
            if(max < score) {
                max = score;
            }
        }
        double sum = 0;
        for(int j = 0; j < n; j++) {
            sum += (double)arr[j] / max * 100;
        }
        System.out.println(sum/n);
        scanner.close();
    }
}