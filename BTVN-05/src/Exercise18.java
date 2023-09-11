import java.util.Arrays;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        int[] arr1 = inputArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println("Mảng trên sau khi sắp xếp theo thứ tự giảm dần.");
        System.out.println(Arrays.toString(sortArrays(arr1)));
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
    public static int [] sortArrays(int[] a){
        int temp = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i +1; j <a.length ; j++) {
                if (a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }return a;
    }
}
