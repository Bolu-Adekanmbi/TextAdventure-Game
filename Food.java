public class Food implements Item {
    private int nutritionLevel;
    private String foodName;

    public Food(String name) {
        this.foodName = name;
    }

    public boolean upgrade() {
        return false;
    }

    

}
