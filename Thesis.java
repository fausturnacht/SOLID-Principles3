public class Thesis implements Borrowable, Readable {
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " is borrowing thesis: " + title);
    }

    @Override
    public void read(Student student){
        System.out.println(student.getName() + " is reading thesis: " + title);
    }
}
