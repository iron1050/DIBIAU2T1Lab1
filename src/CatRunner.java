public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Red", 3, 8.5);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Floofy", 4, 8.5);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
