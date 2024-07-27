package Examples;

import java.util.Scanner;

public class FindthelargestNo {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Please enter the first number ");
        int Number1=Sc.nextInt();
        System.out.println("Please enter the Second number ");
        int Number2=Sc.nextInt();
        System.out.println("Please enter the Third number ");
        int Number3=Sc.nextInt();
        if (Number1>Number2&&Number1>Number3){
            System.out.println("Number1 is the Greatest Number..");
        }
        else if (Number2>Number1&&Number2>Number3) {
            System.out.println("Number2 is the greatest Number..");
        }
        else {
            System.out.println("Number3 is the greatest Number..");
        }
        Sc.close();
    }
}
