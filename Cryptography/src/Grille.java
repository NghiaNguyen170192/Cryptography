import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: DELL
 * Date: 3/21/14
 * Time: 2:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Grille {

    /**
     * Display and write all 7 characters words to file
     *
     * @param messNumb  String will be written to file
     */
    public void displayWord(String messNumb) {
        ArrayList<String> result = readFile("src\\TextFile\\AssDesc.txt");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(i + " - " + result.get(i));
            writeFile(i + " - " + result.get(i), messNumb);
        }
    }

    /**
     * Read the file, get all 7 characters words and return them inside the ArrayList of String
     *
     * @param fileName  String will be written to file
     * @return          ArrayList of 7 characters words
     */
    private ArrayList<String> readFile(String fileName) {
        ArrayList<String> arrStr = new ArrayList<String>();
        try {
            Scanner readFromFile = new Scanner(new File(fileName));
            while (readFromFile.hasNextLine()) {
//                Read every line and store in the temp string
                String temp = readFromFile.nextLine();
//                split string of each line and store in the string array
                String[] arr = temp.split(" ");
                for (int i = 0; i < arr.length; i++) {
//                    remove all special characters
                    arr[i] = arr[i].replaceAll("[^\\w\\s]", "");
//                    check string length
                    if (arr[i].length() == 7) {
//                        add 7 character word into string ArrayList
                        arrStr.add(arr[i].toUpperCase());
                    }
                }
            }
            readFromFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Cannot read");
        }
//        return all 7 characters words
        return arrStr;
    }

    /**
     * Write str to file using string mess as file path
     *
     * @param str  String will be written to file
     * @param mess File Path
     */
    private void writeFile(String str, String mess) {
        try {
            Scanner readFromFile = new Scanner(new File(mess));

            String text = "";
            //Read every line of the file
            while (readFromFile.hasNextLine()) {
                text += readFromFile.nextLine() + "\n";
            }

            //Append input string to file.
            text += str;

            readFromFile.close();

            //Open PrintWriter with input file path
            PrintWriter writer = new PrintWriter(new File(mess));
            //Write file
            writer.print(text);
            writer.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Cannot read");
        }
    }
}
