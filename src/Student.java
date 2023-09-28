public class  Student {
    private String name;
    private int age;

    public Student(String Baijigit, Integer o) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student:" +
                "name:" + name + "\n" +
                " age:" + age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
