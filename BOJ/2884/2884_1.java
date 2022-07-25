/**
* 메모리: 18568 KB, 시간: 240 ms
* 2022.07.25
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        
        if(m < 45) {
            h--;
            if(h < 0) {
                System.out.println(23 + " " + (m+15));
            } else {
                System.out.println(h + " " + (m + 15));
            }
        } else {
            System.out.println(h + " " + (m-45));
        }
        scanner.close();
    }
}