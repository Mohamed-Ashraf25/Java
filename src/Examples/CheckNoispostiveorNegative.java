package Examples;

import java.util.Scanner;

public class CheckNoispostiveorNegative {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Please enter An Number");
        int Number =Sc.nextInt();
        if (Number>=0){
            System.out.println("No is +ve");
        }
        else {
            System.out.println("No is -ve");
        }

        Sc.close();
    }
}
