public class Exercise9 {
    public static void main(String[] args) {
        for (int i = 100000; i <1000000 ; i++) {
            if (searchThuanNghich(i)==1){
                System.out.println(i);
            }
        }
    }
    public static int searchThuanNghich (int a ){
        int temp = 0;
        int index = a;
        int sum = 0;
        while (a>0){
            temp=temp*10+a%10;
            sum += a%10;
            a/=10;
        }if (temp==index && sum%10==0 ){
            return 1;
        }return -1;
    }
}
