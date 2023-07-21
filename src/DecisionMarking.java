import java.util.Scanner;

public class DecisionMarking {
    public static void main(String[] args) {
        /*
        Bài tập ứng dụng 1
        Nhập vào một số nguyên, in ra số dư của số nguyên khi chia cho 5
        *--> switch...case
        **/
        /*
        * Bài tập ứng dụng 2
        Nhập vào tuổi của người dùng , in ra tiền vé xe bus của người đó biết rằng :
        * age <6 : 0 đồng
        * 6<=age<18:3500 đồng
        * 18<=age<60: 7000 đồng
        * age >=: 0 đồng
        * --> if...else if...else
        **/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên :");
        int number= Integer.parseInt(scanner.nextLine());
        switch (number%5){
            case 0:
                System.out.println(number+"chia hết cho 5 :");
                break;
            case 1:
                System.out.printf("%d chia 5 dư 1\n",number);
                break;
            case 2:
                System.out.printf("%d chia 5 dư 2\n",number);
                break;
            case 3:
                System.out.printf("%d chia 5 dư 3\n",number);
                break;
            default:
                System.out.printf("%d chia 5 dư 4\n",number);
                break;

        }
        System.out.println("Nhập vào tuổi của bạn :");
        int age = Integer.parseInt(scanner.nextLine());
        if(age<6 || age>60){
            System.out.println("Giá vé xe bus: 0 đồng");
        }else if(age<18){
            System.out.println("Giá vé xe bus: 3500 đồng");
        }else {
            System.out.println("Giá vé xe bus: 7000 đồng");
        }
    }
}
