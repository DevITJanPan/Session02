import java.util.Scanner;

public class Thuchanh_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tháng trong năm :");
        int month=Integer.parseInt(scanner.nextLine());
        switch (month){
            case 2:
                System.out.printf("Tháng %d có 28 hoặc 29 ngày",month);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %d có 31 ngày",month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có 30 ngày",month);
                break;
            default:
                System.out.println("Tháng không tồn tại");
        }
    }
}
