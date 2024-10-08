package InheriteExample;

public class Main extends Animal{
    public static void main(String[] args) {
        Animal A=new Animal();
        Dog B=new Dog();

        Animal C=new Dog();
        A.Move();
        B.Move();
        C.Move();
    }
}

/*
*OverRidding is Inherited Realated ,Method can`t be override can`t be inherite ,Final method can`t be override
*
* Constructor can`t be override
* */