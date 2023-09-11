import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int[] a = input();
        System.out.println(Arrays.toString(a));
        int[] b = timMaxSecond(a);
        int soLon2=b.length-2;
        System.out.println("Số lớn thứ 2 trong mảng là "+soLon2+" xuất hiện ở vị trí "+timvitri(a,soLon2));

    }
    public static int[] input (){
        System.out.println("Nhập mảng số phần tử của mảng");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            a[i]=new Scanner(System.in).nextInt();
        }
        return a;
    }

    public  static int [] timMaxSecond(int[] a){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }return a;
    }
    public static int timvitri(int[] a , int b){
        for (int i = 0; i < a.length; i++) {
            if(b==a[i]){
                return i;
            }
        }return -1;
    }

}
