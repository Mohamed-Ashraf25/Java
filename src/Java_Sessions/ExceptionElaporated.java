package Java_Sessions;
//Happen due to Run time error "Due to the below "
/*
 * 1-> User Entered invalid data Divided on Zero
 * 2-> File need to open not found
 * 3-> Network connection lost
 * */

import java.io.File;
import java.io.FileReader;

public class ExceptionElaporated {
    public static void main(String[] args) {
        try {
            File f = new File("File.text");

            FileReader Fr = new FileReader(f);
            // if we run the above line without try & catch exception it will lead us to exception and the code will crash
        }
        catch (Exception e){
            e.printStackTrace();  // will return an information about exception
            System.out.println("file Not Found");
        }
    }

}
