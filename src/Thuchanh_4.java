import java.util.Scanner;

public class Thuchanh_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Chỉ số cân nặng của cơ thể :");
        double weight=Double.parseDouble(scanner.nextLine());
        System.out.print("Chiều cao của bạn (tính bằng mét)");
        double height=Double.parseDouble(scanner.nextLine());
        double bmi=weight/ Math.pow(height,2) ;
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi<18){
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        }else if(bmi<25){
            System.out.printf("%-20.2f%s", bmi, "Normal");
        }else if(bmi<30){
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        }else{
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }



    }
}
