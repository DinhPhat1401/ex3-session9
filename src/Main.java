//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice Smith", 20, 3.5);
        Student student2 = new Student(2, "Bob Johnson", 22, 3.8);
        Student student3 = new Student(3, "Charlie Brown", 19, 3.2);

        student1.printInfo();
        System.out.println();
        student2.printInfo();
        System.out.println();
        student3.printInfo();
        System.out.println();
        System.out.println("Total number of students: " + Student.getCount());
    }
}