import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: DELL
 * Date: 2/28/14
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Vernam {

    final private String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ .,:;()-!?$'\"\n0123456789";

    /**
     * Decrypt encrypted message that used Vernam encryption algorithm
     *
     * @param eMess    Encrypted Message
     * @param key      Key to decrypt message
     * @param messNumb String File Path to write the result
     */
    public String decryption(String eMess, String key, String messNumb) {
        String dMess = "";
//        If key length does not match with the length of encrypted message, display the output
        if (key.length() != eMess.length()) {
            dMess = "Key length does not match with cipher text length";
        } else {
//            First loop to go through every encrypted character in the message
            for (int i = 0; i < eMess.length(); i++) {
                int posMess = 0;
                int posKey = 0;
//                Second Loop to calculate the encrypted character position and alphabet character that matches
//                with encrypted letter and return the decrypted character
                for (int j = 0; j < al.length(); j++) {
                    if (eMess.charAt(i) == al.charAt(j)) {
                        posMess = j;
                    }
                    if (key.charAt(i) == al.charAt(j)) {
                        posKey = j;
                    }
                }
                int pos = posMess - posKey;
                while (pos < 0) {
                    pos += al.length();
                }
                dMess += al.charAt(pos);
            }
        }

//          Display result in command output
        System.out.println("Mess:\n" + dMess);
        System.out.println("--------------------------------------------------------------\n");

//        Write result to file
        writeFile(("Key:\n" + key), messNumb);
        writeFile(("Mess:\n" + dMess), messNumb);
        writeFile("--------------------------------------------------------------\n", messNumb);
        return dMess;
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
//            Read every line of the file
            while (readFromFile.hasNextLine()) {
                text += readFromFile.nextLine() + "\n";
            }

//            Append input string to file.
            text += str;

            readFromFile.close();

//            Open PrintWriter with input file path
            PrintWriter writer = new PrintWriter(new File(mess));
//            Write file
            writer.print(text);
            writer.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Cannot read");
        }
    }
}
