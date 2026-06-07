package Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh a :");
        a = scanner.nextInt();
        System.out.println("Nhập chiều dài cạnh b :");
        b = scanner.nextInt();
        System.out.println("Nhập chiều dài cạnh c :");
        c = scanner.nextInt();
        if (a + b < c || a + c < b || b + c < a ){
            System.out.println("Ba cạnh vừa nhập không tạo thành tam giác");
        }else {
            if (a==b && b==c){
                System.out.println("Đây là tam giác đều");
            } else if (a == b ) {
                System.out.println("Đây là tam giác cân");
            } else if (a*a == (b+c)*(b+c) || b*b == (a+c)*(a+c) || c*c == (a+b)*(a+b)) {
                System.out.println("Đây là tam giác vuông");
            }else {
                System.out.println("Đây là tam giác thường");
            }
        }
    }
}
