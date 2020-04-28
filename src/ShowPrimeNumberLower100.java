import java.util.Scanner;
public class ShowPrimeNumberLower100 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập số nguyên cần in ra tất cả số nguyên tố bé hơn hoặc bằng chúng: ");
        int num=scanner.nextInt();
        int n=2;boolean check=true;
        System.out.println("Tất cả các số nguyên tố nhở hơn "+num+" là: ");
        while (n<=num) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                } else {
                    check=true;
                }
            }
            if (check==true){
                System.out.print(n+", ");
            }
            n++;
        }
    }
}
