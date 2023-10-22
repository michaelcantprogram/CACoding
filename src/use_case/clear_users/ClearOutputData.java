package use_case.clear_users;

import java.util.ArrayList;

public class ClearOutputData {

    private final ArrayList<String> users;

    public ClearOutputData(ArrayList<String> users) {this.users = users;}

    public ArrayList<String> getUser() {return users;}
}
