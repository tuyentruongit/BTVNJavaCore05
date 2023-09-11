import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.print("Nhập số hàng ma trận A , B = ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột ma trận A , B = ");
        int col = new Scanner(System.in).nextInt();
        System.out.println("Ma trận A ");
        int[][] matrixA = inputMatix(row,col);
        System.out.println("Ma trận B ");
        int[][] matrixB = inputMatix(row,col);
        int[][] matrixC = sumMatrix(matrixA,matrixB);
        System.out.println("Ma trận A ");
        printMatrix(matrixA);
        System.out.println("Ma trận B ");
        printMatrix(matrixB);
        System.out.println("Tổng hai ma trận A và B là");
        printMatrix(matrixC);



    }



    public static int[][] inputMatix( int n,int m){
        int [][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+i+"]["+j+"] =");
                a[i][j]= new Scanner(System.in).nextInt();
            }
        }return a;
    }

    public static int[][] sumMatrix(int[][] a ,int[][] b){
        int[][] matrixC = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                matrixC[i][j]=a[i][j]+b[i][j];
            }
        }return matrixC;

    }
    public static void   printMatrix (int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print( "  "+a[i][j]+"  ");
            }
            System.out.println("");
        }
    }



}
