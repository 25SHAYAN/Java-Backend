package Exception_Handling;

class Library {
    int availableBooks = 3;

    public void borrowBook(int booksRequested) {
        try {
            int books[] = {101, 102, 103};
            System.out.println("Book requested: " + books[booksRequested]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: Book index out of range");
        }
        catch (NullPointerException e)
        {
            System.out.println("nullpoiner exception");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

public class P6 {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.borrowBook(1);
    }
}
