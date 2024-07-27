package Examples;

import java.util.Scanner;

public class MultiplyFloatingNumber {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Please Enter The Fisrt Number .");
        float Number1=Sc.nextFloat();
        System.out.println("Please Enter The Second Number .");
        float Number2=Sc.nextFloat();
        float Result=Number1*Number2;
        System.out.println("The Result of the Multiplication Operation is "+Result);

        Sc.close();
    }
}
