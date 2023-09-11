import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int[] a = input();
        System.out.println("Mảng vừa nhập : "+ Arrays.toString(a));
    }

    public static int[] input (){
        System.out.println("Nhập mảng số phần tử của mảng");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            a[i]=new Scanner(System.in).nextInt();
            for (int j = 0; j < i; j++) {
              if (a[j]==a[i]){
                  System.out.println("Số bạn vừa nhập đã có trong mảng . Vui lòng nhập lại ");
                  i--;
              }
            }
        }
        return a;
    }
}
