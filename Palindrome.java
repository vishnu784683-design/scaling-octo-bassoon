import java.util.Scanner;
public class Palindrome{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(num==rev)
        {
            System.out.println("it is a palindrom");
        }
        else{
            System.out.println("it is not a palindrom");
        }
    }
}