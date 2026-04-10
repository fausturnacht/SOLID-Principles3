public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Felix");

        // Resources that are both Borrowable and Readable
        Book book = new Book("Book1");
        Journal journal = new Journal("Journal1");
        Thesis thesis = new Thesis("Thesis1");
        Capstone capstone = new Capstone("Capstone1");
        
        // Resource that is ONLY Readable
        Newspaper newspaper = new Newspaper("Newspaper1");

        System.out.println("--- Testing Borrowing ---");
        student.borrow(book);
        student.borrow(journal);
        student.borrow(thesis);
        student.borrow(capstone);

        System.out.println("\n--- Testing Reading ---");
        student.read(book);
        student.read(journal);
        student.read(thesis);
        student.read(capstone);
        student.read(newspaper);
    }
}
