public class Main {
    public static void main(String[] args) {
        Customer aman = new Customer("Aman","Maggi");
        Chef chef = new Chef();
        chef.setCustomer(aman,chef);
        chef.makefood(aman.getOrder());
        System.out.println(aman.askForConfirmation());
        Customer neeraj = new Customer("Neeraj", "Dal Makhani");
        chef.setCustomer(neeraj,chef);
        chef.makefood(neeraj.getOrder());
        System.out.println(neeraj.askForConfirmation());
        Customer deepak = new Customer("Deepak", "Chaap");
        chef.setCustomer(deepak,chef);
        chef.makefood(deepak.getOrder());
        System.out.println(deepak.askForConfirmation());
    }
}
