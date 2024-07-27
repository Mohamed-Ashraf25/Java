package Examples;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Please enter The Leap Year...");
        int Leap=Sc.nextInt();
        if (Leap%4==0)

            if (Leap%100==0){

                if (Leap%400==0){

                    System.out.println("This is a Leap Year");
                }
                else {
                    System.out.println("Not A Leap Year");
                }
//               else{ System.out.println("Leap Year");
            }

        Sc.close();
    }

}
