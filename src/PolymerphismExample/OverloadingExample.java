package PolymerphismExample;
//Static Binding

public class OverloadingExample {
    public void Demo(){
        System.out.println("Welcome");
    }
    public void Demo(int x){
        System.out.println(x+"Welcome");
    }
    public void Demo(int x, int y){
        System.out.println(x+y+"Welcome");
    }
}
