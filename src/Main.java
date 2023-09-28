import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student> arr = new ArrayList<>();

        arr.add(new Student( "Alish",16));
        arr.add(new Student("Amantur",15));
        arr.add(new Student("Baijigit",null));
        for (Student s: arr) {
            if (s.getAge() < 0 ) {
                throw  new RuntimeException();
            }
            System.out.println(s);
        }
        System.out.println(arr.get(3));

    }

        }


