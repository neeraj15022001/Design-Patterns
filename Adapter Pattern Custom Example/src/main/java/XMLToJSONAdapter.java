public class XMLToJSONAdapter implements XML {
//    Implementing Interface client expects to use
    JSON jsonData;
    public XMLToJSONAdapter(JSON jsonData) {
//        We are referencing to the object we are adapting
        this.jsonData = jsonData;
    }

    @Override
    public void printTypeOfData() {
//        Translating XML behaviour to JSON
        jsonData.printTypeOfData();
        jsonData.printObjectData();
    }
}
