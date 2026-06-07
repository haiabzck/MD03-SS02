package Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên bất kỳ");
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
            n = Math.abs(n);
            while (n > 0){
                sum += n % 10;
                n = n / 10;
            }
            System.out.println("Tổng các số đã nhập là : "+ sum);
        }else {
            System.out.println("Số nhập vào ko phải số nguyên !");
        }

        scanner.close();
    }
}
