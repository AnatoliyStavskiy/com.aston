package lesson5;

public class Main {
    public static void main(String[] args) {

        Cat catMurzik = new Cat("Мурзик", -2);
        Dog dogBarsik = new Dog("Барсик");

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Пушок", 15);
        cats[1] = new Cat("Рыжик", 20);
        cats[2] = new Cat("Барсик", 20);
        cats[3] = new Cat("Мурка", 20);
        cats[4] = new Cat("Дымок", 18);

        Plate plate = new Plate(80);

        catMurzik.run(50);
        dogBarsik.run(501);
        catMurzik.swim(2);
        dogBarsik.swim(5);

        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());

        Cat.eating(cats, plate);

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        plate.addFood(40);

        Triangle triangle = new Triangle(3.5, 2.6, 2, "Red", "Blue");
        triangle.print();
        Circle circle = new Circle(24, "Yellow", "Green");
        circle.print();
        Rectangle rectangle = new Rectangle(5, 10, "Grey", "Orange");
        rectangle.print();
    }
}
