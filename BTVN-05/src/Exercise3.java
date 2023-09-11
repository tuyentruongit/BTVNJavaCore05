import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
     int [] b = input();
        System.out.println("mảng bạn vừa nhập có các phần tử là : " + Arrays.toString(b));
        System.out.println("số cặp liên tiếp bằng nhau trong mảng  là  "+count(b));

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
    public static int count (int[] a){
        int sum  = 0 ;
        for (int i = 0; i <a.length-1; i++) {
            if (a[i]==a[i+1]){
                sum++;
            }
        }return sum;
    }

}
