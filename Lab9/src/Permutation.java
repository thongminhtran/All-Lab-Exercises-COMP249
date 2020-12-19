import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Permutation {

    private File outputFile;

    public Permutation(String outputFileName) {
        outputFile = new File(outputFileName);
    }

    public void writePermutations(String word) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile, true));
            writePermutations(word.toCharArray(), 0, word.length() - 1, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writePermutations(char word[], int leftIndex, int rightIndex, PrintWriter writer) {
        if (leftIndex == rightIndex) {
            writer.println(new String(word));
        } else {
            for (int i = leftIndex; i <= rightIndex; i++) {
                swap(word, leftIndex, i);
                writePermutations(word, leftIndex + 1, rightIndex, writer);
                swap(word, leftIndex, i);
            }
        }
    }

    private void swap(char[] str, int i, int j) {
        char c = str[i];
        str[i] = str[j];
        str[j] = c;
    }
}

