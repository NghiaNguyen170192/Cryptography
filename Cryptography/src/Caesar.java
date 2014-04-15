import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: DELL
 * Date: 2/25/14
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Caesar {

    final private String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ .,:;()-!?$'\"\n0123456789";
    /**
     * Decrypt encrypted message that used Caesar encryption algorithm WITH KEY
     *
     * @param eMess     Encrypted Message
     * @param key       Key to decrypt message
     * @param messNumb  String File Path to write the result
     */
    public String decryption(String eMess, int key, String messNumb) {
        String dMess = "";
        for (int i = 0; i < eMess.length(); i++) {
            for (int j = 0; j < al.length(); j++) {
                if (eMess.charAt(i) == al.charAt(j)) {
                    int pos = j - key;
                    if (pos < 0) {
                        pos += al.length();
                    }
                    dMess += al.charAt(pos);
                }
            }
        }

//          Display result in command output
        System.out.println("Key:\n" + key);
        System.out.println("Mess:\n" + dMess);
        System.out.println("--------------------------------------------------------------\n");

//        Write result to file
        writeFile(("Key = " + key + "\nMess:\n" + dMess.trim()), messNumb);
        writeFile("--------------------------------------------------------------\n", messNumb);
        return dMess;
    }

    /**
     * Decrypt encrypted message that used Caesar encryption algorithm WITHOUT KEY
     *
     * @param eMess     Encrypted Message
     * @param messNumb  String File Path to write the result
     */
    public void decryptionWithoutKey(String eMess, String messNumb) {
        System.out.println(al.length());
        for (int key = 1; key < al.length(); key++) {
            String dMess = "";
            for (int i = 0; i < eMess.length(); i++) {
                for (int j = 0; j < al.length(); j++) {
                    if (eMess.charAt(i) == al.charAt(j)) {
                        int pos = j - key;

                        if (pos < 0) {
                            pos += al.length();
                        }
                        dMess += al.charAt(pos);
                    }
                }
            }

//            Display result
            System.out.println("Key = " + key + "\nMess:\n" + dMess);
            System.out.println("--------------------------------------------------------------\n");

            //Write result to file
            writeFile(("Key = " + key + "\nMess:\n" + dMess.trim()), messNumb);
            writeFile("--------------------------------------------------------------\n", messNumb);
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
