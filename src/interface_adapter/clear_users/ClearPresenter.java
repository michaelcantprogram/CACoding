package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import interface_adapter.ViewManagerModel;
import interface_adapter.clear_users.ClearViewModel;
import interface_adapter.clear_users.ClearState;
import java.util.ArrayList;


public class ClearPresenter implements ClearOutputBoundary{

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
    }
    public void prepareSuccessView(ClearOutputData users){
        ClearState clearState = clearViewModel.getState();
        String message = "";
        for (String user : users.getUser()) {
            message += user + "\n";
        }
        clearState.setMessage(message);
        clearViewModel.firePropertyChanged();

    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setError(error);
        clearViewModel.firePropertyChanged();
    }
}
