package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class P5 {
    public static void main(String[] args) {

//        try with multiple catch block and finally
        int arr[] = {1,2,3};
        try{
            System.out.println(arr[6]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("array index out of bound");
        }
        catch (ArithmeticException e)
        {

        }
        finally {
            //which executes every time
            System.out.println("finally");
        }
        System.out.println("hi");

    }
}
