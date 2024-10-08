package StringsExample;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class StringsExamplesss {
    public static void main(String[] args) {

        String S1="Marawan";
        String S2="Mohamed";
        System.out.println(S1.concat(S2)+"\n"+ S1+S2);
        String S="  Ali  ";
        System.out.println(S.trim()); // Remove left & Right Spaces
        System.out.println(S1=S2); //Compare address in memory
        System.out.println(S1.equals(S2));//Compare Case sensitive Return true or false
        System.out.println(S1.equalsIgnoreCase(S2));//Compare without return to capital or small Return true or false
        System.out.println(S1.toLowerCase());
        System.out.println(S1.toUpperCase());
        System.out.println(S1.replace('M','E'));
        String Email="Marawan@Gmail.com";
        String Arr[]=Email.split("@");  //Split can`t use a delimeter {* % ^& ()}
        System.out.println(Arr[0]+"\n"+Arr[1]);
        System.out.println(S.charAt(2)); // return char value by the index
        System.out.println(S1.substring(1,4)); //return Char value string by start & end index
        //-------------------------------------------------------------------------------------
        char A[]={'d','c','b','a'};
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        System.out.println();
        //--------------------------------------------------------------------------------------
        Object W[]={"Ali",'A',5,false};
        for (Object x:W){
            System.out.println(x);
        }
        //--------------------------------------------------------------------------------------
        int D=2;
        String No="10";
        System.out.println(Integer.parseInt(No)); //Convert from string to integer
        System.out.println(Integer.valueOf(No)); //Convert from string to integer & integer to string also
        String Dd=String.valueOf(D); //Convert any value to string
        System.out.println(Dd);
        //---------------------------------------------------------------------------------------
        Random r=new Random();
        Math.random();
        //---------------------------------------------------------------------------------------
        ArrayList<String> J=new ArrayList<String>();
    }
}
