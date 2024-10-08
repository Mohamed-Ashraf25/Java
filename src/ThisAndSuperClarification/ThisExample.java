package ThisAndSuperClarification;
//Can access outer class from inner class also if it declare as a private
//Can`t use this with static & Super together
//this act as a reference for current object we use it if we have a global variabe and need to equal it with local
//Syntax -> {this.     ,  this(,) with constructor ,,--.this  }   this.play();
public class ThisExample {
    int x,y;

    ThisExample(int a,int b){
        this.x=a;
        this.y=b;
        //if we didn`t put this will return a logical error 0

    }
    void display(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ThisExample th=new ThisExample(5,6);
        th.display();
    }
}
