public class Main {
    public static void main(String[] args) {
        JSON jsonData = new JSONData();
        XML xmlData = new XMLData();

        jsonData.printTypeOfData();
        jsonData.printObjectData();
        jsonData.printStringifiedData();

        xmlData.printTypeOfData();

//        Wrapping json in adapter so it behave like XML
        XML adapter = new XMLToJSONAdapter(jsonData);
//        XML now behaving as JSON
        adapter.printTypeOfData();
    }
}
