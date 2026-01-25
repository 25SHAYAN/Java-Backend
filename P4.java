package Exception_Handling;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class P4 {
    public static void main(String[] args) throws FileNotFoundException {
        //checked or unchecked exception
    //eg i need to read a file wich disnot exist
        try {
            FileReader f = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            //this is auto generated try catch so it gices throw
            //throw new RuntimeException(e);
        }

    }
}
