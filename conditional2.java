import java.util.Scanner;

public class conditional2 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        if(b%400==0 || b%100==0 || b%4 ==0){
            System.out.println("leap year");
        }
        else{
            System.err.println("not a leap year");
        }
    }
}
