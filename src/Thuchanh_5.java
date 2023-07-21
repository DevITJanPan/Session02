import java.util.Scanner;

public class Thuchanh_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d is ", number);
        int units = number % 10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;
        String str_units, str_dozens = "", str_hundreds = "", str_output = "";
        switch (units) {
            case 0:
                str_units = "Zero";
                break;
            case 1:
                str_units = "One";
                break;
            case 2:
                str_units = "Two";
                break;
            case 3:
                str_units = "Three";
                break;
            case 4:
                str_units = "Four";
                break;
            case 5:
                str_units = "Five";
                break;
            case 6:
                str_units = "Six";
                break;
            case 7:
                str_units = "Seven";
                break;
            case 8:
                str_units = "Eight";
                break;
            default:
                str_units = "Nine";
        }
        switch (dozens) {
            case 1:
                switch (units) {
                    case 0:
                        str_dozens = "Ten";
                        break;
                    case 1:
                        str_dozens = "Eleven";
                        break;
                    case 2:
                        str_dozens = "Twelve";
                        break;
                    case 5:
                        str_dozens = "Fifteen";
                        break;
                    default:
                        str_dozens = str_units + "teen";

                }
                break;
            case 2:
                str_dozens = "Twenty";
                break;
            case 3:
                str_dozens = "Thirty";
                break;
            case 4:
                str_dozens = "Forty";
                break;
            case 5:
                str_dozens = "Fifty";
                break;
            case 6:
                str_dozens = "Sixty";
                break;
            case 7:
                str_dozens = "Seventy";
                break;
            case 8:
                str_dozens = "Eighty";
                break;
            case 9:
                str_dozens = "Ninety";
                break;

        }
        if (number < 10) {
            str_output = str_units;
        } else if (number < 20) {
            str_output = str_dozens;
        } else if (number < 100) {
            if (units == 0) {
                str_output = str_dozens;
            } else {
                str_output = str_dozens + "-" + str_units;
            }
        } else if (number < 1000) {
            switch (hundreds) {
                case 1:
                    str_hundreds = "One";
                    break;
                case 2:
                    str_hundreds = "Two";
                    break;
                case 3:
                    str_hundreds = "Three";
                    break;
                case 4:
                    str_hundreds = "Four";
                    break;
                case 5:
                    str_hundreds = "Five";
                    break;
                case 6:
                    str_hundreds = "Six";
                    break;
                case 7:
                    str_hundreds = "Seven";
                    break;
                case 8:
                    str_hundreds = "Eight";
                    break;
                case 9:
                    str_hundreds = "Nine";
                    break;
            }
            str_hundreds += " hundred";
            if (dozens == 0) {
                if (units == 0) {
                    str_output = str_hundreds;
                } else {
                    str_output = str_hundreds + " " + str_units;
                }
            } else if (dozens == 1) {
                str_output = str_hundreds + " " + str_dozens;
            } else {
                if (units==0){
                    str_output = str_hundreds + " " + str_dozens;
                }else {
                    str_output = str_hundreds + " and " + str_dozens + "-" + str_units;
                }
            }
        }
        System.out.println(str_output);

    }
}

