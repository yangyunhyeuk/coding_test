import java.util.Arrays;

public class test_0218_2 {

    public static void main(String[] args) {
        new test_0218_2().start();
    }

    public void start() {
        String[] strs = {"dog", "racecar", "car"};
        longestCommonPrefix(strs);
    }

    public String longestCommonPrefix(String[] a) {

        // 해당 배열 정렬
        Arrays.sort(a);

        // 배열 비어있을 경우 "" 반환
        if (a.length == 0) {
            return "";
        }

        // 배열 내용 하나일 경우 첫 번째 인덱스 값 반환
        if (a.length == 1) {
            return a[0];
        }

        int size = a[0].length();

        int cnt = 0;
        while (cnt < size && a[0].charAt(cnt) == a[a.length - 1].charAt(cnt)) {
            cnt += 1;
        }
        String ok = a[0].substring(0, cnt);
        System.out.println(ok);
        return ok;
    }
}
