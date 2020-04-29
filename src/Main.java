import FileTests.FileTests;

public class Main {

    public static void main(String[] args) {
        FileTests fileTests = new FileTests();
//        fileTests.createFile();
//        fileTests.writeToFile();
//        fileTests.readFromFile();
//        fileTests.insertToNotesFromFile();
//        fileTests.deleteFile();
        fileTests.readAndSort();
        createFile();     //creating 1000 files
        //deleteFiles();  // delete 1000 giles
        //writeToFiles();  // write to each of 1000 files
    }
}
