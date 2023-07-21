import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Các số nguyên chẵn trong khoảng 1-10 là :");
        for (int i = 1; i <=10; i++) {
            if(i%2==0){
                System.out.printf("%d\t",i);
            }

        }
        System.out.printf("\n");
        // In ra 10 số nguyên chia hết cho 2 bắt đầu từ 1
        int cnt = 0;
        System.out.println("10 số nguyên chia hết cho 2 bắt đầu từ 1:");
        int a=1;
        while(cnt<10){
            if(a%2==0){
                System.out.printf("%d\t",a);
                cnt ++;
            }
            a++;
        }
        System.out.println("\n");
        //4. Vòng lặp Foreach
        int[] arrInt={3,5,7};
        System.out.println("Các phần tử trong mảng là :");
        for(int element:arrInt){
            System.out.printf("%d\t",element);
        }
        System.out.printf("\n");
        /*
        * In ra menu sau:
        * **********Menu**********
        * 1. Phở bò kobe
        * 2. Bánh mỳ trứng
        * 3. Mỳ tôm không người lái
        * 4. Thoát
        * Sự lựa chọn của bạn :
        **/
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("**********Menu**********");
            System.out.println("1. Phở bò kobe");
            System.out.println("2. Bánh mỳ trứng");
            System.out.println("3. Mỳ tôm không người lái");
            System.out.println("4. Thoát");
            System.out.println("Sự lựa chọn của bạn :");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Bạn vừa chọn Phở bò kobe");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn Bánh mỳ trứng");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn Mỳ tôm không người lái");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn giá trị từ 1-4");
            }
        }while(true);

    }
}
