package cho.ym.decorator.myException;

public enum Code {
    SUCCESS(0, "Success"),
    FAIL(1, "Fail"),
    ERROR(2, "Error");

    private int code;
    private String description;

    Code(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
