import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_0215 {
    public int solution1(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        System.out.println(answer);
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        for (int i = n; i >= 1; i--) {
            if (n % i == 1) {
                answer = i;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public int solution3(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                answer -= absolutes[i];
            } else {
                answer += absolutes[i];
            }
        }
        System.out.println(answer);
        return answer;
    }

    public int solution4(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public int[] solution5(int[] numbers) {
        List<Integer> numberList = new ArrayList<Integer>();
        int[] result;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];

                if (!numberList.contains(sum)) {
                    numberList.add(sum);
                }
            }
        }
        result = numberList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);

        return result;
    }


    public static void main(String[] args) {
        // 1~9까지의 정수 중 존재하지 않는 수를 더하시오
        //int[] number = {1, 2, 3, 4, 5, 6, 7, 9};
        //new test_0215().solution(number);

        // 매개변수 n을 x로 나눈 나머지가 1이 되도록하는 가장 작은 자연수 x를 return하시오
        // new test_0215().solution2(12);

        // 정수와 부호를 전달하여 합 계산
        // int[] number = {4, 7, 12};
        // boolean[] signs = {true, false, true};
        // new test_0215().solution3(number, signs);

        // 내적
        // int[] inner = {1, 2, 3};
        // int[] outer = {-1, -1, -1};
        // new test_0215().solution4(inner, outer);

        // 정수 배열 랜덤 추출 후 합한 숫자
        // int[] number = {2, 1, 3, 4, 1};
        // new test_0215().solution5(number);


    }
}

