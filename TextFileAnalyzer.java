// Do not modify this code

public class TextFileAnalyzer {

    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        String sampleText = "This is the first line.\nThis is the second line with some e's.\nA third line follows.\nAnd finally, the last line.";
        char targetChar = 'e';

        FileCreator fileCreator = new FileCreator();
        CharacterCounter characterCounter = new CharacterCounter();
        LineReverser lineReverser = new LineReverser();
        FileCopy fileCopy = new FileCopy();

        // Perform the tasks
        fileCreator.createFileAndPopulate(inputFileName, sampleText);
        characterCounter.countCharacter(inputFileName, targetChar);
        lineReverser.reverseFileLines(inputFileName);
        fileCopy.copyFile(inputFileName, outputFileName);

        System.out.println("\n--- Analysis Complete ---");
    }
}
