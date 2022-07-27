import java.util.ArrayList;
import java.util.List;

public class test_0218_1 {


    public static void main(String[] args) {
        new test_0218_1().start();
    }

    public void start() {
        int i = -121;
        isPalindrome(i);
    }

    public boolean isPalindrome(int x) {

        String number = String.valueOf(x); // 매개변수를 문자열 값으로 저장
        System.out.println("number : " + number);

        String[] num = number.split(""); // 정수 각 자릿수를 저장한 배열

        List<String> splitNum = new ArrayList<>(); // 각 정수 값을 저장할 문자열 형태 리스트
        List<String> splitReverseNum = new ArrayList<>(); // 각 정수 값을 뒤집어 저장할 문자열 리스트

        // 각 정수 값을 리스트에 저장
        for (int i = 0; i < num.length; i++) {
            splitNum.add(num[i]);
        }

        // 값을 반환할 boolean 변수
        boolean flag = false;

        // 뒤집어 값을 저장한다
        for (int i = num.length - 1; i >= 0; i--) {
            splitReverseNum.add(splitNum.get(i));
        }

        for (int i = 0; i < splitNum.size(); i++) {
            System.out.print(splitNum.get(i));
        }
        System.out.println();
        for (int i = 0; i < splitNum.size(); i++) {
            System.out.print(splitReverseNum.get(i));
        }

        // 값을 비교하여 일치할 시 true 초기화
        if (splitNum.equals(splitReverseNum)) {
            flag = true;
        }
        System.out.println();
        System.out.println(flag);
        return flag;
    }

}
