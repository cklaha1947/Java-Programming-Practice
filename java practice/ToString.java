public class ToString {
    public class Student {
        String name;
        int age;
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        @Override
        public String toString() {
            return "Student[name=" + name + ", age=" + age + "]";
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Student student = new Student("John", 20);
            System.out.println(student.toString());
        }
    }
    
    // Output:
    // Student[name=John, age=20]
    
    
}
