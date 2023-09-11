import java.util.Arrays;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(Arrays.toString(arr));
        int countOddNumber = countOddNumber(arr);
        System.out.println("Mảng trên có "+countOddNumber+" số chẵn và "+(arr.length-countOddNumber)+" số lẻ");
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
    public static int countOddNumber (int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                count++;
            }
        }return count;
    }
}
