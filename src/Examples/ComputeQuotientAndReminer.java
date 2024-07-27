package Examples;

import java.util.Scanner;

public class ComputeQuotientAndReminer {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Please Enter The Dividend Number");
        int Dividened= Sc.nextInt();
        System.out.println("Please Enter the Divisor Number ");
        int Divisor= Sc.nextInt();
        int Quotient=Dividened/Divisor;
        int Reminder= Dividened % Divisor;
        System.out.println("The Quotient Is "+Quotient);
        System.out.println("The Reminder is "+Reminder);
        Sc.close();
    }}
