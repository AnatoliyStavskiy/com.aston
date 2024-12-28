package lesson5;

public class Plate {

    private int countFood;

    public void addFood(int count) {
        countFood += count;
    }

    public Plate(int countFood) {
        this.countFood = countFood;
    }

    public int getCountFood() {
        return countFood;
    }

    public void setCountFood(int eaten) {
        this.countFood = eaten;
    }
}
