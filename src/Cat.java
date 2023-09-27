// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
    }

    // method that introduces the Cat
    public void introduce() {
        System.out.print("Hello my name is " + name);
        if (age < 7) {
            System.out.print(" and I am a younger cat");
        }
        if (age >= 7) {
            System.out.print(" and I am an older cat");

        }
        if (age < 2); {
            System.out.print("That must be a cute kitten!");
        }
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}



