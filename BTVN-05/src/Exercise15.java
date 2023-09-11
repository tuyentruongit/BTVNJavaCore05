import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.println("Nhập số a : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số b : ");
        int b = new Scanner(System.in).nextInt();
        int UCLN = timUCLN(a,b);
        if (UCLN==1){
            System.out.println("Số "+a+" và số "+b+" là 2 số nguyên tố cùng nhau");
            return;
        }
        System.out.println("Số "+a+" và số "+b+" không là 2 số nguyên tố cùng nhau");
    }
    public static int timUCLN(int a, int b) {
        int uocchungLonnhat = 1;
        for (int i = 1;i<=a && i<=b;i++){
            if (a%i==0 && b%i==0){
                uocchungLonnhat = i;
            }
        }
        return uocchungLonnhat;
    }
}
