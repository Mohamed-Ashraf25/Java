package Examples;

import java.util.Scanner;

public class PrintAnIntegerNumber{

    public static void main(String[] args) {
        System.out.println("Please Enter An integer Number ..");
        Scanner Sc= new Scanner(System.in);
        int Number1=Sc.nextInt();
        System.out.println("The Number That entered By user is "+ Number1);
        Sc.close();
    }
}
