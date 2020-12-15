package homework4.fibonacci;

public class MyBusinessCheckedException extends Exception {
    private final ErrorCode code;

    public MyBusinessCheckedException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }
}
