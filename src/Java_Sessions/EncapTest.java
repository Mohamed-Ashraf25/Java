package Java_Sessions;

//provide hidig data from seeing in another classes
public class EncapTest {
    private int Age;
    private  String name;

//    public int getAge() {
//        return Age;
//    }
//
//    public void setAge(int age) {
//        Age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public  int GetAge(){
        return  Age;
    }
    public String GetName(){
        return  name;
    }
    public void  SetAge(int Age){

        this.Age=Age;
    }
    public void SetName(String Name){

        this.name=Name;
    }


}
