public class Teacher1 {
    String name, city;
    int id;
    // String m;

    // constructor overloading
    Teacher1() {
        // System.out.println("No value.");

    }

    Teacher1(String n, String c) {
        name = n;
        city = c;
    }

    Teacher1(String n, String c, int i) {
        name = n;
        city = c;
        id = i;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("City:" + city);
        System.out.println("id:" + id);
        // System.out.println("no:" + m);
        System.out.println("\n\n");

    }

}
