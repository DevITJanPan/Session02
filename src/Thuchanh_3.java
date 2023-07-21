import java.util.Scanner;

public class Thuchanh_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=Integer.parseInt(scanner.nextLine());
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.printf("%d là năm nhuận ",year);
                }else {
                    System.out.printf("%d là năm không nhuận ",year);
                }
            }else{
                System.out.printf("%d là năm nhuận",year);
            }
        }else {
            System.out.printf("%d là năm không nhuận ",year);
        }
    }
}
