package use_case.clear_users;

import use_case.clear_users.ClearOutputBoundary;
import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{

    private ClearUserDataAccessInterface userDataAccessObject;
    private ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary clearPresenter){
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute(ClearInputData clearInputData){
        ArrayList<String> users = userDataAccessObject.getUser();
        ClearOutputData clearOutputData = new ClearOutputData(users);
        if (userDataAccessObject.clear()){
            clearPresenter.prepareSuccessView(clearOutputData);
        } else {
            clearPresenter.prepareFailView("Failed to clear users.");
        }
    }
}
