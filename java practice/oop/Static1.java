public class Static1 {
    // static variable-> variable=>constat
    String name;
    int id;
    static String univname = "Calcutta University.";
    static String city = "Kolkata";
    static String stream = "MCA";

    Static1(String n, int i) {
        name = n;
        id = i;
        // univname = u;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("id:" + id);
        System.out.println("University Name:" + univname);
        System.out.println("City:" + city);
        System.out.println("Stream:" + stream);
        System.out.println("\n\n");
    }

}
