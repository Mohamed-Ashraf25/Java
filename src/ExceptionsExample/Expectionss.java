package ExceptionsExample;
//Error happens due to Run time error
//Entered invalid data or file not found or unbounded or network issue

public class Expectionss {

    public static void main(String[] args) {
        int []arr={1,2,3};
       try {
           System.out.println(arr[4]);
       }
        catch (Exception E){
           E.getCause();
           E.getMessage();
           E.printStackTrace();

        }
    }
}
