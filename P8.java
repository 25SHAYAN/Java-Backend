package Exception_Handling;

class Library2 {
    int availableBooks = 3;

    public void borrowBook(int booksRequestedCount) throws Exception {
        if (booksRequestedCount > availableBooks) {
            throw new Exception("Not enough books available");
        }
        System.out.println("Book issued successfully");
    }
}

public class P8 {
    public static void main(String[] args) {
        Library2 lb = new Library2();
        try {
            lb.borrowBook(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
