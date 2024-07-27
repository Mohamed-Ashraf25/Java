package Java_Sessions;

public class Motor_Interface implements  Carinterface{
    @Override
    public void Motor() {
        System.out.println("lets Work");
    }

    @Override
    public void DisplayScreen() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Motor_Interface Mo=new Motor_Interface();
        Mo.DisplayScreen();
        Mo.Motor();
    }
}
