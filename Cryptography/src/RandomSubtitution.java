import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: DELL
 * Date: 3/4/14
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class RandomSubtitution {

    private final String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ .,:;()-!?$'\"\n0123456789";
    int [] count = new int [al.length()];

    /**
     * To count characters'occurence
     * @param eMess    Encrypted Message
     * @param messNumb String will be written to file
     */
    public void countChar(String eMess, String messNumb){
//        Initiate default value of the int array
        for (int i =0; i < count.length; i ++){
            count[i]= 0;
        }
//        Count how many times each character is on the encrypted message
        for (int i =0; i < eMess.length(); i ++){
            for (int j =0; j < al.length(); j ++){
                if (eMess.charAt(i) == al.charAt(j)){
                    count[j] ++;
                }
            }
        }

//        Display and Write the result to file
        for (int i =0; i < count.length; i ++){
            String str = al.charAt(i) + " = " + count[i];
            System.out.println(str);
            writeFile(str, messNumb);
        }
    }

    /**
     * Write str to file using string mess as file path
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
