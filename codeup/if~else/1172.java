import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrSize = 3;

        // 선언
        int[] arr = new int[arrSize];

        // 입력
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        // 정렬
        int temp;
        for (int i = 0; i < arrSize-1; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 출력
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
