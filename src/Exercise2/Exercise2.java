package Exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int dayNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên từ 1 đến 7: ");
        dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sáu");
                break;
            case 7:
                System.out.println("Thứ bảy");
                break;
            default:
                System.out.println("Số nhập vào không hợp lệ.");
                break;
        }

        scanner.close();
    }
}
