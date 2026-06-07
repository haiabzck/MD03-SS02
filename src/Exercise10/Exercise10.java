package Exercise10;

import java.util.Scanner;

public class Exercise10 {

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // Tách chữ số cuối cùng
            sum += digit * digit; // Cộng dồn bình phương chữ số vào tổng
            num /= 10;           // Cắt bỏ chữ số cuối
        }
        return sum;
    }

    public static boolean isHappy(int num) {
        // Lặp cho đến khi số bằng 1 (Happy) hoặc rơi vào vòng lặp vô hạn (chứa số 4)
        while (num != 1 && num != 4) {
            num = sumOfSquares(num); // Cập nhật num bằng tổng bình phương mới
        }

        // Nếu kết thúc vòng lặp mà num bằng 1 thì đó là số Happy
        return num == 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // 3. Nhập dữ liệu và kiểm tra tính hợp lệ
        do {
            System.out.print("Nhập vào số nguyên dương N: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số lớn hơn 0!");
            }
        } while (n <= 0);

        System.out.println("Các số Happy trong khoảng từ 1 đến " + n + " là:");

        // 4. Duyệt qua các số từ 1 đến N và in ra số Happy
        for (int i = 1; i <= n; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Xuống dòng khi kết thúc chương trình
    }
}
