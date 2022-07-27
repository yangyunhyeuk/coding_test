public class test_0217_2 {

    public static void main(String[] args) {
        new test_0217_2().start();
    }

    public void start() {
        int[] arrA = {2, 3, 5, 7, 9, 11};
        int[] arrB = {4, 6, 8, 10, 12};
        int[] arrSum;

        arrSum = mergeArrays(arrA, arrB);
        ascList(arrSum);
        printList(arrSum);
    }

    public int[] mergeArrays(int[] arrA, int[] arrB) {
        int sumLength = arrA.length + arrB.length;
        int[] arrSum = new int[sumLength];

        for (int i = 0; i < sumLength; i++) {
            if (i < arrA.length) {
                arrSum[i] = arrA[i];
            } else {
                arrSum[i] = arrB[i - arrA.length];
            }
        }
        return arrSum;

    }


    public void ascList(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void printList(int[] list) {
        System.out.print("{ ");
        for (int i = 0; i < list.length - 1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length - 1] + " }");

    }


}
