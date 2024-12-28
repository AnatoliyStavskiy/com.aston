package lesson5;

public abstract class Animal {

    private String name;
    private static int animalCount;

    public void run(int length) {
        System.out.println(getName() + " пробежал " + length + " м.");
    }

    public void swim(int length) {
        System.out.println(getName() + " проплыл " + length + " м.");
    }

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return animalCount;
    }
}
