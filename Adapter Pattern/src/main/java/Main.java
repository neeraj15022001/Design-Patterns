public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        ToyDuck plasticToyDuck = new PlasticToyDuck();

        sparrow.makeSound();
        sparrow.fly();

        plasticToyDuck.squeak();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.squeak();
    }
}
