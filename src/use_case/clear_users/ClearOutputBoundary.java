package use_case.clear_users;

import java.util.ArrayList;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData users);

    void prepareFailView(String message);
}
