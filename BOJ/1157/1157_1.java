/**
* 메모리: 45288 KB, 시간: 548 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next().toUpperCase();

		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				int n = map.get(ch);
				map.replace(ch, ++n);
				continue;
			}
			map.put(ch, 1);
		}
		int max = 0;
		char result = ' ';
		for(char c : map.keySet()) {
			int value = map.get(c);

			if(max == value) {
				result = '?';
			}
			if(max < value) {
				max = value;
				result = c;
			}
		}
		System.out.println(result);
		scanner.close();
    }
}