package life.majiang.communtiy.communtiy.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUD("问题不存在");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
