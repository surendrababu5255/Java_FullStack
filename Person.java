package surendrababu;

public class Person {
    // Instance variables
    private String name;
    private int age;
    private String interests;

    // Constructor
    public Person(String name, int age, String interests) {
        // Initialize instance variables using constructor parameters
        this.name = name;
        this.age = age;
        this.interests = interests;
    }

    // Method to update interests
    public void updateInterests(String newInterests) {
        this.interests = newInterests;
    }
    // Method to calculate and return the number of characters in the name
    public int calculateNameLength() {
        return this.name.length();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("Arun", 25, "watching animis");
        Person person2 = new Person("Pavan", 30, "Gaming");

        // Displaying profiles
        System.out.println("Person 1 Profile:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Interests: " + person1.interests);
        System.out.println("Name Length: " + person1.calculateNameLength());

        System.out.println("\nPerson 2 Profile:");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
        System.out.println("Interests: " + person2.interests);
        System.out.println("Name Length: " + person2.calculateNameLength());

        // Updating interests and display the updated profile
        person1.updateInterests("Reading Books");
        System.out.println("\nUpdated Person 1 Profile:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Interests: " + person1.interests);
        System.out.println("Name Length: " + person1.calculateNameLength());
    }
}

