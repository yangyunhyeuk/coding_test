public class test_0214 {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 여기서 약수를 판별한다.
            int cnt = 0; // cnt는 약수의 갯수
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    cnt += 1;
                }

            }
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        System.out.println(answer);
        return answer;

    }

    public static void main(String[] args) {
        new test_0214().solution(13, 17);


    }
}
