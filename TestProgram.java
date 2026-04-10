public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Felix");

        Literature book = new Book("Book1");
        Literature journal = new Journal("Journal1");
        Literature thesis = new Thesis("Thesis1");
        Literature capstone = new Capstone("Capstone1");
        Literature newspaper = new Newspaper("Newspaper1");

        System.out.println("--- Testing Borrowing ---");
        book.borrow(student);
        journal.borrow(student);
        thesis.borrow(student);
        capstone.borrow(student);
        newspaper.borrow(student);

        System.out.println("\n--- Testing Reading ---");
        book.read(student);
        journal.read(student);
        thesis.read(student);
        capstone.read(student);
        newspaper.read(student);
    }
}
