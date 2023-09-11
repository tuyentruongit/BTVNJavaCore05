import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        for (int i = 10000; i <10000000 ; i++) {
            if (searchThuanNghich(i)==1&&searchSNT(i)==1&&searchNumber(i)==1){
                System.out.println(i);
            }
        }
    }
    public static int searchSNT (int a){
        for (int i = 2; i <=Math.sqrt(a); i++) {
            if (a%i==0){
                return -1;
            }
        }return 1;
    }
    public static int searchThuanNghich (int a ){
        int temp = 0;
        int index = a;
        int sum = 0;
        while (a>0){
            temp=temp*10+a%10;
            a/=10;
        }if (temp==index ){
            return 1;
        }return -1;
    }
    public static int searchNumber (int a){
        while (a>0){
            int index = a%10;
            a/=10;
           if (index==4){
               return -1;
           }
        }return 1;
    }

}
