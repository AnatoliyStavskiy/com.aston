package lesson3;


public class Park {

    String name;

    public Park(String name) {
        this.name = name;
    }

    public Park() {
    }

    class Attraction {
        String name;
        String openingHours;
        int price;

        public String whatPark() {
            return Park.this.getName();
        }

        public Attraction(String name, String openingHours, int price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }
}
