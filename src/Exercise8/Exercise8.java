package Exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int number;
        int hundreds;
        int tens;
        int units;
        String result ="";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số ");
        number = scanner.nextInt();

        if (number < 100 || number > 999){
            System.out.println("Số nhập vào không hợp lệ !");
        }else {
            units = number % 10 ;
            tens = (number/10) % 10 ;
            hundreds =number/100;
            switch (hundreds) {
                case 1:
                    result += "Một trăm ";
                    break;
                case 2:
                    result += "Hai trăm ";
                    break;
                case 3:
                    result += "Ba trăm ";
                    break;
                case 4:
                    result += "Bốn trăm ";
                    break;
                case 5:
                    result += "Năm trăm ";
                    break;
                case 6:
                    result += "Sáu trăm ";
                    break;
                case 7:
                    result += "Bẩy trăm ";
                    break;
                case 8:
                    result += "Tám trăm ";
                    break;
                case 9:
                    result += "Chín trăm ";
                    break;
            }
            switch (tens) {
                case 0 :
                    if (units == 0){
                        result +="";

                    }else {
                        result +="linh ";
                        break;
                    }
                case 1:
                    result += "mười ";
                    break;
                case 2:
                    result += "hai mươi ";
                    break;
                case 3:
                    result += "ba mươi ";
                    break;
                case 4:
                    result += "bốn mươi ";
                    break;
                case 5:
                    result += "năm mươi ";
                    break;
                case 6:
                    result += "sáu mươi ";
                    break;
                case 7:
                    result += "bẩy mươi ";
                    break;
                case 8:
                    result += "tám mươi ";
                    break;
                case 9:
                    result += "chín mươi ";
                    break;
            }
            if (units !=0){
                switch (units){
                    case 1:
                        result += "một";
                        break;
                    case 2:
                        result += "hai";
                        break;
                    case 3:
                        result += "ba";
                        break;
                    case 4:
                        result += "bốn";
                        break;
                    case 5:
                        result += "năm";
                        break;
                    case 6:
                        result += "sáu";
                        break;
                    case 7:
                        result += "bẩy";
                        break;
                    case 8:
                        result += "tám";
                        break;
                    case 9:
                        result += "chín";
                        break;
                }
            }
            System.out.printf("Kết quả : " + result);
        }
    }
}
