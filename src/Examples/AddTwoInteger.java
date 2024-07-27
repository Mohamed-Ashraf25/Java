package Examples;

import java.util.Scanner;

public class AddTwoInteger {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Please Enter The Fisrt Number .");
        int Number1=Sc.nextInt();
        System.out.println("Please Enter The Second Number .");
        int Number2=Sc.nextInt();
        int Result=Number1+Number2;
        System.out.println("The Result of the Sum Operation is "+Result);

        Sc.close();
    }
}
