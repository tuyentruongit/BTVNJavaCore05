import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.print("Nhập số m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập số n = ");
        int n = new Scanner(System.in).nextInt();
        if (m>n){
            System.out.println("Không thỏa mãn điều kiện (m<n) của để bài . ");
        }
        int c = vitri(m,n);
        for (int i =m ; i <=n ; i++) {
            if ((Math.sqrt(i) * 10) % 10 == 0) {
                System.out.println(i+ " ");
            }

        }  System.out.println("Có "+c+" số chính phương xuất hiện trong đoạn  ");
    }
    public static int vitri (int a, int b){
        int count = 0;
        for (int i =a ; i <=b ; i++) {
            if ((Math.sqrt(i)*10)%10==0){
               count++;
            }
        }return count   ;
    }
}
