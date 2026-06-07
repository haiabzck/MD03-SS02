package Exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Vui lòng nhập tuổi của bạn : ");
            if (scanner.hasNextInt()){
                age = scanner.nextInt();
                if (age <= 0){
                    System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                }
            }else {
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                scanner.next(); // Xóa giá trị không hợp lệ ra khỏi bộ nhớ
            }
        }while (age <= 0);

        System.out.printf("Tuổi của bạn là "+ age);

        scanner.close();
    }
}
