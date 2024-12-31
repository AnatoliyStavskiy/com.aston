package lesson5;

public class Plate {

    private int countFood;

    public Plate(int countFood) {
        this.countFood = countFood;
    }

    public void addFood(int count) {
        countFood += count;
    }

    public int getCountFood() {
        return countFood;
    }

    public void setCountFood(int eaten) {
        this.countFood = eaten;
    }
}
