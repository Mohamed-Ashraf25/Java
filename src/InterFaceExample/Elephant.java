package InterFaceExample;

public class Elephant implements Animal{


    @Override
    public void printSentence() {
        System.out.println("Ahmed");
    }

    @Override
    public void Welcome() {
        System.out.println("Greeting");
    }

    public static void main(String[] args) {
        Elephant E=new Elephant();
        E.printSentence();
        E.Welcome();
    }
}
