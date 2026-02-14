import java.util.Scanner;
public class Leap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter a leap");
        if(a<=365){
            System.out.println("is not a leap year");
        }
        else {
            System.out.println("is a leap year");
        }
    }
}
