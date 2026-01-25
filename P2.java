package Exception_Handling;

public class P2 {
    public static void main(String[] args) {
        //exception handling

        try {
            //exception generating statements
            int result = 10 / 0;
        } catch (Exception e) {
            //exception handling statements
            System.out.println("in catch block");
        }
        //eg 2 direclty shows try block code as it is coreect
        try {
            //exception generating statements
            int result1 = 10 / 3;
            System.out.println("done");
        } catch (Exception e) {
            //exception handling statements
            System.out.println("in catch block");
        }
        //eg 3 if there is exception in try block then next statemnts woont exceute goes to catch block
        try {
            //exception generating statements
            int result2 = 10 / 0;
            System.out.println("done");
        } catch (ArithmeticException e ) {
            //exception handling statements
            System.out.println("in catch block");
        }
    }
}
