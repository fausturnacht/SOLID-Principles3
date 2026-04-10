public class Capstone implements Literature {
    private String title;

    public Capstone(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " is borrowing capstone: " + title);
    }

    @Override
    public void read(Student student) {
        System.out.println(student.getName() + " is reading capstone: " + title);
    }
}
