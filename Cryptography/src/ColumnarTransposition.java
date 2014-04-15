import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: DELL
 * Date: 3/2/14
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class ColumnarTransposition {

    /**
     * Decrypting the encrypted message using Columnar Transposition algorithm.
     * Display and write to file  the key and decrypted message
     * @param eMess    Encrypted Message
     * @param messNumb String will be written to file
     */
    public void decryptionWithoutKey(String eMess, String messNumb) {
//        Calculate factors
        ArrayList<Integer> factor = findFactor(eMess.length());
//        First loop: to check every key
        for (int key = 0; key < factor.size(); key++) {
            int row = eMess.length() / factor.get(key);
            int pos = 0;
            String dMess = "";
//            Second loop to run from 0 to ecrypted message length
//            Decrypt every character and append to dMess
            for (int i = 0; i < eMess.length(); i++) {
                if (i == 0) {
                    pos = 0;
                } else {
                    pos = pos + row;
                }

                if (pos >= eMess.length()) {
                    pos = pos % eMess.length() + 1;
                }
                dMess += eMess.charAt(pos);
            }

//            Display result in command output
            System.out.println("Key:\n" + factor.get(key));
            System.out.println("Mess:\n" + dMess);
            System.out.println("--------------------------------------------------------------\n");

//            Write result to file
            writeFile(("Key = " + factor.get(key) + "\nMess:\n" + dMess.trim()), messNumb);
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

    /**
     * Return an ArrayList that holds all factors calculated from input number
     * @param  number  the input must be an int
     * @return factors an ArrayList stores factors
     */
    private ArrayList<Integer> findFactor(int number){
        ArrayList<Integer> factors = new ArrayList<Integer>();
//        This loop starts from 2 to the input number.
//        And the i increases by 1
        for (int i = 2; i < number; i++) {
//            If the remainder is equal to 0, then add this number to the ArrayList
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
