package Examples;

import java.util.Scanner;

public class CheckNoEvenorOdd {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Please enter A Number..");
        int Number=Sc.nextInt();
        if (Number%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }

        Sc.close();
    }
}
