package data_access;

import java.io.*;
import java.util.*;
import use_case.clear_users.ClearUserDataAccessInterface;

public class ClearUserDataAccessObject implements ClearUserDataAccessInterface{

    private final File csvFile;
    public ClearUserDataAccessObject(String csvPath) {
        csvFile = new File(csvPath);
    }

    public ArrayList<String> getUser(){
        ArrayList<String> users = new ArrayList<>();
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Skip the header
            while ((line = br.readLine()) != null) {
                // Use the comma as separator
                String[] data = line.split(csvSplitBy);
                users.add(data[0]);  // Assuming the CSV structure is consistent and every line has a username as the first entry
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }


    public boolean clear() {
        try {
            FileWriter fileWriter = new FileWriter(csvFile);
            fileWriter.write("");
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
