package Java_Sessions;

public class InheritedfromAbstractClass extends AbstractClass{
    @Override
    public void Sound() {
        System.out.println("Roar");
    }

    public static void main(String[] args) {
        AbstractClass Abs=new InheritedfromAbstractClass();
        Abs.Sound();
    }
}
