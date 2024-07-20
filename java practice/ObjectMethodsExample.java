public class ObjectMethodsExample {
    private int id;
    private String name;

    public ObjectMethodsExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectMethodsExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ObjectMethodsExample that = (ObjectMethodsExample) obj;
        return id == that.id && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return 31 * id + (name != null ? name.hashCode() : 0);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing ObjectMethodsExample with id: " + id);
        super.finalize();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectMethodsExample obj1 = new ObjectMethodsExample(1, "John");
        ObjectMethodsExample obj2 = new ObjectMethodsExample(2, "Doe");

        // toString() method
        System.out.println("Object 1: " + obj1.toString());

        // equals() method
        System.out.println("Are objects equal? " + obj1.equals(obj2));

        // hashCode() method
        System.out.println("HashCode of obj1: " + obj1.hashCode());
        System.out.println("HashCode of obj2: " + obj2.hashCode());

        // clone() method
        ObjectMethodsExample clonedObj = (ObjectMethodsExample) obj1.clone();
        System.out.println("Cloned Object: " + clonedObj);

        // finalize() method
        obj1 = null;
        obj2 = null;
        clonedObj = null;
        // Explicit garbage collection
        System.gc();
    }
}
