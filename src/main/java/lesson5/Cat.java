package lesson5;

public class Cat extends Animal {

    private static int catCount;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        catCount++;
    }

    public static int getCount() {
        return catCount;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static void eating(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            if (cat.appetite <= plate.getCountFood() & cat.appetite > 0) {
                cat.satiety = true;
                plate.setCountFood(plate.getCountFood() - cat.appetite);
            } else System.out.print("Кот " + "'" + cat.getName() + "'" + " не смог поесть!" + "\n");
        }
    }

    @Override
    public void run(int length) {
        if (length > 0 & length < 201) {
            super.run(length);
        } else System.out.println("Кот столько не может пробежать");
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + super.getName() +
                " satiety=" + isSatiety() +
                '}';
    }
}
