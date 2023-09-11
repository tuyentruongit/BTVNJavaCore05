import java.util.Arrays;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(Arrays.toString(arr));
        System.out.print("Nhập số x : ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Số "+ x + " xuất hiện "+search(arr,x)+" lần trong mảng");
    }
    public static int[] inputArray (){
        System.out.println("Nhập số lượng phần tử trong mảng ");
        int n = new Scanner(System.in).nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr1["+i+"] =");
            arr1[i]=new Scanner(System.in).nextInt();
        }
        return arr1;
    }
    public static int search (int[] a,int b){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (b==a[i]){
                count++;
            }
        }return count;
    }
}
