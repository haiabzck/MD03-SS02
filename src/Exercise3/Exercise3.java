package Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số bất kỳ :");
        N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ.");
        } else {
            int sum = 0;

            for (int i = 1; i <= N; i++) {
                sum += i;
            }

            System.out.printf("Tổng các số từ 1 đến "+ N +" là:" + sum);
        }

        scanner.close();
    }
}
