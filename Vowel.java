import java.util.Scanner;
public class Vowel {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
        
    }
}
