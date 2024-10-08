package PolymerphismExample;

public class Main extends OverriddingExample{

    @Override
    public  void Sound(){
        System.out.println("WEES");
    }

    public static void main(String[] args) {
        OverloadingExample OVL=new OverloadingExample();
        OverriddingExample OVR=new OverriddingExample();
Main M=new Main();
        OVR.Sound();
        M.Sound();
        OVL.Demo();
        OVL.Demo(5);
        OVL.Demo(5,6);

    }




}
