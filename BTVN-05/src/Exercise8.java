import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Ma trận A ");
        System.out.print("Nhập số hàng m = ");
        int rowA = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột = ");
        int colA = new Scanner(System.in).nextInt();
        System.out.println("Ma trận B ");
        System.out.print("Nhập số hàng n = ");
        int rowB = new Scanner(System.in).nextInt();
        System.out.print("Nhập số hàng k = ");
        int colB = new Scanner(System.in).nextInt();
        int[][] matrixA = new int[rowA][colA];
        int[][] matrixB = new int[rowB][colB];
//        int[][] matrixC = new int[rowA][colB];

        System.out.println("Ma trận A ");
        for (int i = 0; i <rowA ; i++) {
            for (int j = 0; j < colA; j++) {
                System.out.print("a["+i+"] ["+j+"] =");
                matrixA[i] [j]=new Scanner(System.in).nextInt();
            }
        }

        System.out.println("Ma trận B ");
        for (int i = 0; i <rowB ; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print("b["+i+"] ["+j+"] =");
                matrixB[i] [j]=new Scanner(System.in).nextInt();
            }
        }
    }

//    public static int[][] input(int a ,int b , int c){
//        System.out.println("Ma trận A ");
//        System.out.print("Nhập số hàng m = ");
//        int rowA = new Scanner(System.in).nextInt();
//        System.out.print("Nhập số cột = ");
//        int colA = new Scanner(System.in).nextInt();
//        System.out.println("Ma trận B ");
//        System.out.print("Nhập số hàng n = ");
//        int rowB = new Scanner(System.in).nextInt();
//        System.out.print("Nhập số hàng k = ");
//        int colB = new Scanner(System.in).nextInt();
//        int[][] matrixA = new int[rowA][colA];
//        int[][] matrixB = new int[rowB][colB];
//        int[][] matrixC = new int[rowA][colB];
//
//
//
//        for (int i = 0; i <rowA ; i++) {
//            for (int j = 0; j < colA; j++) {
//                System.out.println("a["+i+"] ["+j+"] =");
//                matrixA[i] [j]=new Scanner(System.in).nextInt();
//            }
//        }
//
//        for (int i = 0; i <rowB ; i++) {
//            for (int j = 0; j < colB; j++) {
//                System.out.println("a["+i+"] ["+j+"] =");
//                matrixB[i] [j]=new Scanner(System.in).nextInt();
//            }
//        }

//    }
}
