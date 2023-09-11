import java.util.Arrays;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử trong mảng ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Mảng A");
        int[] arr1 = inputArray(n);
        System.out.println("Mảng B");
        int[] arr2 = inputArray(n);
//        int[] sum = new int[n];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = arr2.length-1; j >=0 ; j++) {
//                sum[i]=arr1[i]
//            }
//        }


//
        int[] sum = sumArrays(arr1,arr2);
        System.out.println("Tổng 2 mảng A và B là " + Arrays.toString(sum));
    }
    public static int[] inputArray (int n){
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("["+i+"] =");
            arr1[i]=new Scanner(System.in).nextInt();
        }
        return arr1;
    }
    public static int[] sumArrays(int[] a, int[] b ){
        int[] sum = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = b.length-1; j>=(b.length-1)-i;j-- ) {
                sum[i]=a[i]+b[j];
            }
        }return sum;
    }

}
