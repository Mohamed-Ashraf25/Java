package Java_Sessions;

/*
* over loading is static binding
*
* More than one method have the same method name but different parameter
*
* */

public class PolmerphyismElaporated {
    public void Sum(int x){
        System.out.println(x);
    }
    public void Sum(int x,int y){
        System.out.println(x+y);
    }
    public void Sum(int x,int y,int z){
        System.out.println(x+y+z);
    }
}
