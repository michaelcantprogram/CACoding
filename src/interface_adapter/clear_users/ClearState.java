package interface_adapter.clear_users;


public class ClearState {

    private String error = null;

    private String message = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ClearState() {}

    public ClearState(ClearState copy) {
        error = copy.error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }




}
