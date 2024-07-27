package Java_Sessions;

import Examples.AddTwoInteger;
// To import some classes from another package ,, "Write import + Package Name;   then you can use the classes "
public class EnglishCourse {
 int student,Weeks,Days;
    public static void main(String[] args) {
        int totaldays;

        EnglishCourse Eng=new EnglishCourse();
        Eng.student=25;
        Eng.Days=7;
        Eng.Weeks=13;
        totaldays=Eng.student+ Eng.Days+Eng.Weeks;
        System.out.println("The total days is "+totaldays);
        String Greeting="Hello";
        int length=Greeting.length();
        System.out.println("The length of string is "+ length);

        String Full_Greeting=Greeting.concat("Ali");
        System.out.println("The Full Greeting is "+Full_Greeting);



    }
}
