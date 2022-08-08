/**
* 메모리: 15928 KB, 시간: 140 ms
* 2022.08.08
* by Alub
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int idx = 0;
		for(int i = 0; i < str.length; i++) {
			idx = i + 1;
			switch(idx) {
				case 1:
				case 2:
					bw.write((1 - Integer.parseInt(str[i]) + " "));
					break;
				case 3:
				case 4:
				case 5:
					bw.write((2 - Integer.parseInt(str[i]) + " "));
					break;
				case 6:
					bw.write((8 - Integer.parseInt(str[i]) + " "));
					break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
    }
}