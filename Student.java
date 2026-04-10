public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void borrow(Borrowable resource) {
        resource.borrow(this);
    }

    public void read(Readable resource) {
        resource.read(this);
    }
}
