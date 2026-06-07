package Exercise9;

import java.util.Scanner;

public class Exercise9 {

        // 1. Hàm đếm số lượng chữ số của một số nguyên
        public static int countDigits(int num) {
            if (num == 0) return 1;
            int count = 0;
            while (num > 0) {
                count++;
                num /= 10; // Cắt bỏ chữ số cuối cùng
            }
            return count;
        }

        // 2. Hàm kiểm tra xem một số có phải là số Armstrong hay không
        public static boolean isArmstrong(int num) {
            // Các số từ 0 đến 9 luôn là số Armstrong
            if (num >= 0 && num <= 9) return true;

            int originalNum = num;
            int k = countDigits(num); // Lấy số lượng chữ số (bậc lũy thừa)
            int sum = 0;

            // Vòng lặp tách từng chữ số và tính tổng lũy thừa
            while (num > 0) {
                int digit = num % 10; // Lấy chữ số cuối cùng

                // Cộng dồn lũy thừa bậc k của chữ số đó vào biến sum
                sum +=(int) Math.pow(digit, k);

                num /= 10; // Cắt bỏ chữ số cuối cùng
            }

            // Nếu tổng lũy thừa bằng số ban đầu thì trả về true
            return sum == originalNum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n;

            // 3. Vòng lặp đảm bảo người dùng nhập vào số nguyên dương
            do {
                System.out.print("Nhập vào số nguyên dương N: ");
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Vui lòng nhập số lớn hơn hoặc bằng 0!");
                }
            } while (n < 0);

            System.out.println("Các số Armstrong từ 0 đến " + n + " là:");

            // 4. Duyệt qua tất cả các số từ 0 đến N và in ra số Armstrong
            for (int i = 0; i <= n; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Xuống dòng khi kết thúc
        }
}
