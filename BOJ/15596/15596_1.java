/**
* 메모리: 422792 KB, 시간: 36 ms
* 2022.07.26
* by Alub
*/
public class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
