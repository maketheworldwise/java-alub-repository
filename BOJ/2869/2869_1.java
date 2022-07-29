/**
* 메모리: 14188 KB, 시간: 128 ms
* 2022.07.30
* by Alub
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int days = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) {
			days++;
		}
        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
        br.close();
    }
}