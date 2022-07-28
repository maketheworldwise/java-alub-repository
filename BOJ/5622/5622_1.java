/**
* 메모리: 17588 KB, 시간: 200 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String str = scanner.next().toLowerCase();
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			int ascii = (int)str.charAt(i) - 'a';
            if(ascii > 14 && ascii < 19) { // PQRS
                sum += 8;
            } else if (ascii > 18 && ascii < 22) { // TUV
                sum += 9;
            } else if (ascii > 21 && ascii < 26) { // WXYZ
                sum += 10;
            } else { // ABCDEFGHIJKLMNO
			    sum += ascii / 3 + 3;
            }
		}
		System.out.println(sum);
		scanner.close();
    }
}