public class Customer implements Waiter {
    private final String name;
    private final String foodItem;
    private Chef chef;
    public Customer(String name, String foodItem) {
        this.name = name;
        this.foodItem = foodItem;
    }
    @Override
    public String getOrder() {
        return this.foodItem;
    }
    public String getName() {
        return this.name;
    }
    public void setChefReference(Chef chef) {
        this.chef = chef;
    }
    public boolean askForConfirmation() {
        if(chef.confirmMyFoodItem() != null) {
            System.out.println(chef.confirmMyFoodItem());
            return true;
        }
        return false;
    }
}
