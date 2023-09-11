import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int[] a = input();
        System.out.println(Arrays.toString(a));
        if (mangDoixung(a)==1){
            System.out.println("Mảng trên là mảng đối xứng");
            return;
        }
        System.out.println("Mảng trên không là mảng đối xứng ");
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
    public static int mangDoixung(int[] a){
        if (a.length%2==0){
            for (int i = 0; i < a.length; i++) {
                if(a[i]==a[a.length-i-1]){
                    return 1;
                }
            }
        }return -1;
    }
}
