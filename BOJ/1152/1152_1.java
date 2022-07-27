/**
* 메모리: 30812 KB, 시간: 484 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());
        scanner.close();
    }
}