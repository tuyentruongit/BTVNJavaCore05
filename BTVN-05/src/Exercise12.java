import java.util.Scanner;

public class Exercise12 {


    public static void main(String[] args) {
        int[][] a = input();
        int b = sum(a);
        System.out.println("Ma Trận ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print( "  "+a[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("Tổng đường chéo của mã trận trên là : "+b);
    }
    public static int[][] input(){
        System.out.println("Nhập số hàng  ");
        int n = new Scanner(System.in).nextInt();
        int [][] arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("arr["+i+"] ["+j+"] =");
                arr[i][j]=new Scanner(System.in).nextInt();
            }
        }return arr;

    }
    public static  int sum (int[][] a){
        int sum = 0 ;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j <=i; j++) {
                sum+=a[i][j];
            }
        }return sum;
    }
}
