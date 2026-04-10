public class Newspaper implements Literature {
    private String title;

    public Newspaper(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " is borrowing newspaper: " + title);
    }

    @Override
    public void read(Student student) {
        System.out.println(student.getName() + " is reading newspaper: " + title);
    }
}
