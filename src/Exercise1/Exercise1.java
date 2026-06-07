package Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số bất kỳ :");
        n =  scanner.nextInt();

        if (n == 0){
            System.out.println("Số vừa nhập không phải chẵn cũng không phải lẻ");
        } else if (n % 2 == 0) {
            System.out.println("Số vừa nhập là số chẵn");
        }else {
            System.out.println("Số vừa nhập là số lẻ");
        }
        scanner.close();
    }
}
