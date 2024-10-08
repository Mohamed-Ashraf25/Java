import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//Normal Classess  or "Concrete Class Can Be  Access Using object "
//Abstract Class is not a complete class At least have an abstract method
//Final Variabe cant be change ,,Method can`t be override ,, class can`t be inherite

    //default value of int ->0 ,Boolean -> False , String -> Null ,Ch=\u0000 =termination

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int Number=Integer.valueOf(Sc.next()); //Take A String Value From User & Convert it Into Integer
        System.out.println(Number);
        Sc.close();
    }
}