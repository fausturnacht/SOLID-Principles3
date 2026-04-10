public class Journal implements Borrowable, Readable {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " is borrowing journal: " + title);
    }

    @Override
    public void read(Student student){
        System.out.println(student.getName() + " is reading journal: " + title);
    }
}
