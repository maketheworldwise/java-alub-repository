/**
* 메모리: 17852 KB, 시간: 240 ms
* 2022.07.26
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            String s = scanner.next();
            int acc = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == 'O') {
                    acc++;
                } else {
                    acc = 0;
                }
                result[i] += acc;
            }
        }
        for(int k = 0; k < n; k++) {
            System.out.println(result[k]);
        }
        scanner.close();
    }
}