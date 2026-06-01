public class Student {
    private int id;
    private String fullName;
    private int age;
    private double gpa;
    public static int count = 0;
    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 4.0;

    public Student(int id, String fullName, int age, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        setGpa(gpa);
        count++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < MIN_GPA || gpa > MAX_GPA) {
            throw new IllegalArgumentException("GPA must be between " + MIN_GPA + " and " + MAX_GPA);
        }
        this.gpa = gpa;
    }
    public static int getCount() {
        return count;
    }
    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}
