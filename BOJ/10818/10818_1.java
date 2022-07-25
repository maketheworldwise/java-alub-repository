/**
* 메모리: 142932 KB, 시간: 1108 ms
* 2022.07.25
* by Alub
*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrNum = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        int max = -1_000_000;
        int min = 1_000_000;
        while(st.hasMoreTokens()) {
            int currentNumber = Integer.parseInt(st.nextToken());
            if(max < currentNumber) {
                max = currentNumber;
            }
            if(min > currentNumber) {
                min = currentNumber;
            }
        }
        System.out.println(min + " " + max);
        scanner.close();
    }
}