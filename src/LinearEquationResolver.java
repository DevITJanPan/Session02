import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation 'a * x + b = c', please enter constants:");
        Scanner scanner=new Scanner(System.in);
        double a=Double.parseDouble(scanner.nextLine());
        double b=Double.parseDouble(scanner.nextLine());
        double c=Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a: ");
        System.out.println("Enter b: ");
        System.out.println("Enter c: ");
        if(a!=0){
            double x=(c-b)/a;
            System.out.printf("%f phương trình có nghiệm duy nhất ",x);
        }else{
            if(b==c){
                System.out.printf("%f Phương trình có vô số nghiệm");
            }else {
                System.out.printf("%f Phương trình vô nghiệm");
            }
        }

    }
}
