import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        int[] a = input();
        System.out.println("Mảng A : "+ Arrays.toString(a));
        double b = sum(a);
        System.out.println("Trung bình cộng [ b , c ] là "+ b);
    }
    public static int[] input (){
        System.out.println("Nhập mảng số phần tử của mảng");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            a[i]=new Scanner(System.in).nextInt();
        }
        return a;
    }
    public static double sum (int[] a){
        System.out.println("Nhập số nguyên b");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhập số nguyên c");
        int c = new Scanner(System.in).nextInt();
        double sum = 0;
        int count = 0;
//        double TBC = sum/count;
        if (b>c){
            System.out.println("Bạn cần nhập đúng điều kiện (b<c)");
        }
        if (b<c){
            for (int  i = 0; i < a.length; i++) {
                if (a[i]>=b && a[i]<=c){
                    sum+=a[i];
                    count++;
                }
            }

        }
        double TBC = sum/count;
        return TBC;
    }
}
