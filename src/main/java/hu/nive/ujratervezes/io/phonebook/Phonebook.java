package hu.nive.ujratervezes.io.phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) throws IllegalArgumentException {

        if (contacts == null || output == null) throw new IllegalArgumentException();

        try {
            PrintWriter writer = new PrintWriter(new File(output));
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}