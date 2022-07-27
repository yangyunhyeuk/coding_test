public class test_0217_1 {

    // if digits are [5, 8, 4], then [5, 8, 5] should be returned
    // if digits are [5, 9, 9], then [6, 0, 0] should be returned

    public static void main(String[] args) {
        int[] arr = {5, 9, 9};

        StringBuffer num = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            num.append(arr[i]);
        }
        System.out.println(num);
        int number = Integer.parseInt(String.valueOf(num));
        number += 1;

        System.out.println(number);

        String digit = String.format(String.valueOf(number));
        String[] digits = digit.split("");

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }

    }
}
