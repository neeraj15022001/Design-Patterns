public class JSONData implements JSON{
    @Override
    public void printTypeOfData() {
        System.out.println("Printing JSON Data");
    }

    @Override
    public void printStringifiedData() {
        System.out.println("Printing JSON Data in Stringified Mode");
    }

    @Override
    public void printObjectData() {
        System.out.println("Printing JSON Data in Object Mode");
    }
}
