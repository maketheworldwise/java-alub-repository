/**
* 메모리: 17680 KB, 시간: 204 ms
* 2022.08.23
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder str = new StringBuilder(scanner.next());
		int loop = str.length() / 10;
		int len = 0;
		for(int i = 1; i <= loop; i++) {
			if(i > 1) len++;
			str.insert(10*i + len, "\n");
		}
		System.out.println(str);
		scanner.close();
    }
}