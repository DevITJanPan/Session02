import java.util.Scanner;

public class Session2_baitap {
    public static void main(String[] args) {
//        *YC1. Nhập vào một số nguyên từ bàn phím
//        *YC2. In ra menu và thực hiện chức năng theo menu
//        * ******Menu*****
//        * 1. Kiểm tra chẵn lẻ
//        * 2. Kiểm tra chia hết cho 3 và 5
//        * 3. Kiểm tra số nguyên tố
//        * 4. Kiểm tra số hoàn hảo
//        * 5. Thoát
//        **/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên");
        int number =Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("**********Menu**********");
            System.out.println("Kiểm tra chẵn lẻ");
            System.out.println("Kiểm tra chia hết cho 3 và 5");
            System.out.println("Kiểm tra số nguyên tố");
            System.out.println("Kiểm tra số hoàn hảo");
            System.out.println("Thoát");
            System.out.println("Sự lựa chọn của bạn :");
            int choice=Integer.parseInt(scanner.nextLine());


            switch (choice){
                case 1:
                    if (number % 2 == 0) {
                        System.out.printf("%d  là số chẵn\n",number);
                    } else {
                        System.out.printf("%d  là số lẻ\n",number);
                    }
                    break;
                case 2:
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.printf("%d chia hết cho cả 3 và 5\n",number);
                    } else {
                        System.out.printf("%d không chia hết cho cả 3 và 5\n",number);
                    }
                    break;
                case 3:
                    boolean checkPriem=true;
                    if(number>=2){
                        for (int i = 2; i <=Math.sqrt(number); i++) {
                            if(number%i==0){
                                checkPriem=false;
                                break;
                            }

                        }
                    }else{
                        checkPriem=true;
                    }
                    if(checkPriem){
                        System.out.printf("%d là số nguyên tố\n",number);
                    }else{
                        System.out.printf("%d không phải là số nguyên tố\n",number);
                    }
                    break;
                case 4:
                    int sum=0;
                    for(int i=1; i<number;i++){
                        if(number%i==0){
                            sum+=i;
                        }
                    }
                    if(sum==number){
                        System.out.printf("%d là số hoàn hảo\n",number);
                    }else{
                        System.out.printf("%d không phải là số hoàn hảo",number);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1 đến 5");
            }
        }while (true);
    }
}
