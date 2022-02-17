import java.util.ArrayList;
import java.util.List;

public class test_0217 {
    /*
        public int solution1(int num) {

            int x = 1;
            int y = 1;
            int z = 0;
            int sum = 0;

            System.out.println(x);
            System.out.println(y);

            for (int i = 1; i <= num; i++) {
                z = x + y;
                System.out.println(z);
                x = y;
                y = z;
                sum += z;
            }
            System.out.println("z : "+z);
            System.out.println("sum : "+sum);
            return sum;
        }
    */
    public String solution2(String num) {
        String reverse = "reverse";

        String[] arr = num.split("");
        List<Integer> arrCnt = new ArrayList();
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a")) {
                cnt += 1;
                arrCnt.add(i);
            } else if (arr[i].equals("e")) {
                cnt += 1;
                arrCnt.add(i);
            } else if (arr[i].equals("i")) {
                cnt += 1;
                arrCnt.add(i);
            } else if (arr[i].equals("o")) {
                cnt += 1;
                arrCnt.add(i);
            } else if (arr[i].equals("u")) {
                cnt += 1;
                arrCnt.add(i);
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("모음의 갯수 : " + cnt);


        for (int i = 0; i < arr.length; i++) {
            for (int j = cnt; j > 0; j--) {
                //arr[i]

            }
        }

        return reverse;
    }

    public static void main(String[] args) {
        /*
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
        int num = 8;

        new test_0217().solution1(num);
        */

        new test_0217().solution2("coke");

        // a, e, i, o, u

    }
}
