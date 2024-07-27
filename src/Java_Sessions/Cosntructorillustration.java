package Java_Sessions;


/*
Constructor have the same name of class without return type  ,, can be wih argument or not
Can`t be abstract ,final & static
if we don`t create a constructor by default jvm create one in .class file or .bin file
* if we need to call another constructor from inner constructor use this.("","");
*constructor run when we take an object only
we don`t use loops and if inside constructor we can`t do operation inside constructor only defind data .

*/
public class Cosntructorillustration {
    private String name ;
    private  int Age;
    Cosntructorillustration(){
        this("Ali",5);  // Be Noted This & Super in Class Written at first
        System.out.println("this the first constructor");
    }
    Cosntructorillustration(String Name,int Age){
       this.name="Marawan";
       this.Age=2;
        System.out.println("This is the second constructor");
    }
    Cosntructorillustration(String Name){

        System.out.println("This is the 3rd constructor ");
    }
}
