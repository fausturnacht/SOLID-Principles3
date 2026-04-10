public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void borrow(Literature resource) {
        resource.borrow(this);
    }

    public void read(Literature resource) {
        resource.read(this);
    }
}
