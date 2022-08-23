/**
* 메모리: 17684 KB, 시간: 212 ms
* 2022.08.24
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
		String[] dayOfWeek = new String[]{"SUN", "MON","TUE","WED","THU","FRI","SAT"};

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		int days = n;
		for(int i = 1; i < m; i++) {
			switch(i) {
				case 1: days += 31; break;
				case 2: days += 28; break;
				case 3: days += 31; break;
				case 4: days += 30; break;
				case 5: days += 31; break;
				case 6: days += 30; break;
				case 7: days += 31; break;
				case 8: days += 31; break;
				case 9: days += 30; break;
				case 10: days += 31; break;
				case 11: days += 30; break;
				case 12: days += 31; break;
			}
		}

		System.out.println(dayOfWeek[days % 7]);
    }
}