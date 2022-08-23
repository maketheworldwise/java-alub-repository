/**
* 메모리: 14456 KB, 시간: 124 ms
* 2022.08.23
* by Alub
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}