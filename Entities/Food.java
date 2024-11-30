public class Food implements Item {
    private int nutritionLevel;
    private String foodName;


    public Food(String name, int nutrition) {
        this.foodName = name;
        this.nutritionLevel = nutrition;
    }

    public boolean upgrade(Upgrade foodUpgrade) {
        return false;
    }





    

}
