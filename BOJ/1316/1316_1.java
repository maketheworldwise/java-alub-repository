/**
* 메모리: 17856 KB, 시간: 216 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		int count = 0;
		for(int i = 0; i < t; i++) {
			String str = scanner.next();
			StringBuilder sb = new StringBuilder();

			// 연속된 중복 제거
			sb.append(str.charAt(0));
			for(int j = 1; j < str.length(); j++) {
				char pre = str.charAt(j - 1);
				char cur = str.charAt(j);
				if(pre != cur) {
					sb.append(cur);
				}
			}

			// 중복이 제거된 문자열 (ps)
			String ps = sb.toString();
			// 중복이 제거된 문자열의 길이
			int psLen = ps.length();
			// 하나씩 줄어드는 ps의 길이와 비교하기 위한 변수
			int temp = psLen;
			// 그룹인지 아닌지를 판단하는 변수
			boolean flag = false;
			while(ps.length() > 0) {
				// ps의 첫 번째 문자를 ps에서 모두 제거
				ps = ps.replace(String.valueOf(ps.charAt(0)), "");
				// 첫 번째 문자를 모두 제거한 ps의 길이가 중복이 제거된 문자열의 길이에서 하나를 뺀 값과 다를 경우
				if(temp - 1 != ps.length()) {
					flag = true;
				}
				temp--;
			}
			
			if(!flag) count++;

		}
		System.out.println(count);
		scanner.close();
    }
}