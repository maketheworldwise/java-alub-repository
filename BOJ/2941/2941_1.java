/**
* 메모리: 17616 KB, 시간: 196 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(int i = 0; i < cro.length; i++) {
			if(str.contains(cro[i])) {
				str = str.replace(cro[i], "?");
			}
		}
		System.out.println(str.length());
		scanner.close();
    }
}