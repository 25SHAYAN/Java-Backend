package Exception_Handling;
class Library1{
        int availableBooks=3;

public void borrowBook(int booksRequestedcount){
        try{
       if(booksRequestedcount > availableBooks)
       {
           throw new Exception("not enough books avaialble");
       }
        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception occurred: Book index out of range");
        }
        catch(Exception e)
        {
        System.out.println("exception solved");
        }
        finally{
        System.out.println("Finally block executed");
        }
        }
        }
public class P7 {
    public static void main(String[] args) {
        //throw and throws
        Library1 lb = new Library1();
        lb.borrowBook(5);
    }
}
