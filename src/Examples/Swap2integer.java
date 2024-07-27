package Examples;

import java.util.Scanner;

public class Swap2integer {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Please Enter the First Number ");
        int Number1=Sc.nextInt();
        System.out.println("Please Enter the Second Number ");
        int Number2=Sc.nextInt();
        int TempVar=Number1;
        Number1=Number2;
        Number2=TempVar;
        System.out.println("After Swapping Two Number... ");
        System.out.println("Number1 is "+ Number1);
        System.out.println("Number2 is "+ Number2);
        Sc.close();
    }
}
