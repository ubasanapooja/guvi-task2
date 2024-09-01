public class Person {
    private String name;
    private int age;

    // Constructor with default age
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Getters and setters
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

    public static void main(String[] args) {
        // Create person object with default age
        Person person1 = new Person("John");
        person1.displayDetails();

        // Create person object with name and age
        Person person2 = new Person("Alice", 25);
        person2.displayDetails();
    }
}
