package Courses;

public class EnglishCourses {

    int student;
    static int N;

    /*
    * Static No Can Access Without Take an object both static & No Static Method
    * Can`t Use Static with super and this
    * */
    public void PrintSentenece(){
        System.out.println("Marawan");
        N=10;
        System.out.println(N);
    }
    public static void main(String[] args) {
        EnglishCourses Eng=new EnglishCourses();
        Eng.student=10;
        System.out.println(Eng.student);

        String Greeting ="Welcome ";
        System.out.println(Greeting.length());
        System.out.print("Welcome"); // Print in one line
        N=15;
        System.out.println(N);
    }
}
