import java.util.Arrays;
import java.util.Scanner;

public class Exsecise11 {
    public static void main(String[] args) {
        int [][] a = input();
        int maxNumber = maxArrays(a);
        int minNumber = minArrays(a);
//        System.out.println(a);
        System.out.println("Số lớn nhaats trong mảng là "+maxNumber);
        System.out.println("Số nhỏ nhất trong mảng là " + minNumber);

    }
    public static int[][] input(){
        System.out.println("Nhập số hàng ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập số cột ");
        int m = new Scanner(System.in).nextInt();
        int [][] arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print("arr["+i+"] ["+j+"] =");
                arr[i][j]=new Scanner(System.in).nextInt();
            }
        }return arr;
    }
    public static int maxArrays(int[][] a ){
        int max = a[0][0];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (a[i][j]>max){
                    max=a[i][j];
                }
            }
        }return max;
    }
    public static int minArrays(int[][] a ){
        int min = a[0][0];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (a[i][j]<min){
                    min=a[i][j];
                }
            }
        }return min;
    }
}
