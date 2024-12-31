package lesson5;

public class Dog extends Animal {

    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getCount() {
        return dogCount;
    }

    @Override
    public void run(int length) {
        if (length > 0 & length < 501) {
            super.run(length);
        } else System.out.println("Собака столько не может пробежать");
    }

    @Override
    public void swim(int length) {
        if (length > 0 & length < 11) {
            super.swim(length);
        } else System.out.println("Столько собака не может проплыть");
    }
}
