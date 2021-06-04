public class Chef implements Waiter2 {
    Customer customer;
    public void makefood(String foodItem) {
        System.out.println(customer.getName());
        System.out.println(customer.getOrder());
    }
    public void setCustomer(Customer newCustomer, Chef chef) {
        this.customer = newCustomer;
        customer.setChefReference(chef);
    }

    @Override
    public String confirmMyFoodItem() {
        return (customer.getName() + "->" + customer.getOrder());
    }
}
