package ConstructorExample;

//Block of code that intilize newly created object ,,same name of classess without return types ,,
//Run when take an object from class
//Constructor can`t be overridden ,Abstract ,Final & Static
//Used For Synchornization
//Can`t use loops or if Just intilize Data Can`t use any operator
public class Machine {
    private int Age;
    private String Name;
    public Machine(){
        //this statement must be the fisrt senetence nothing can precede it
        this(15,"Ali"); //Call constructor instead or copy all code ,
        System.out.println("1st Consturctor");
    }
    public Machine(String name){
      // this(name,10);
        System.out.println("2nd Consturctor");
    }
    public Machine(int age,String name){
        System.out.println("3rd Consturctor");
        this.Name=name;
        this.Age=age;
    }
}
