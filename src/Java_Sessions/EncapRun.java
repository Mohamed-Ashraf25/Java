package Java_Sessions;

public class EncapRun {
    public static void main(String[] args) {

        EncapTest Encap=new EncapTest();
        Encap.SetAge(5);
        Encap.SetName("Ahmed");
        System.out.println(Encap.GetAge());
        System.out.println(Encap.GetName());
    }
}
