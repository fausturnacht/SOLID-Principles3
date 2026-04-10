public class Book implements Literature {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " is borrowing book: " + title);
    }

    @Override
    public void read(Student student) {
        System.out.println(student.getName() + " is reading book: " + title);
    }
}
