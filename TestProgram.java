public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Felix");

        Literature book = new Book("Book1");
        Literature journal = new Journal("Journal1");
        Literature thesis = new Thesis("Thesis1");
        Literature capstone = new Capstone("Capstone1");
        Literature newspaper = new Newspaper("Newspaper1");

        System.out.println("--- Testing Borrowing ---");
        student.borrow(book);
        student.borrow(journal);
        student.borrow(thesis);
        student.borrow(capstone);
        student.borrow(newspaper);

        System.out.println("\n--- Testing Reading ---");
        student.read(book);
        student.read(journal);
        student.read(thesis);
        student.read(capstone);
        student.read(newspaper);
    }
}
