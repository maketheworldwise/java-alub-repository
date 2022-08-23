/**
* 메모리: 17708 KB, 시간: 212 ms
* 2022.08.23
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        String str = scanner.next();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
        
        scanner.close();
    }
}