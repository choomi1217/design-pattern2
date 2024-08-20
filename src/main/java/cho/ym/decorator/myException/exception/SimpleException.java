package cho.ym.decorator.myException.exception;

import cho.ym.decorator.myException.Code;
import cho.ym.decorator.myException.deco.ExceptionDeco;

public class SimpleException extends MyException {
    @Override
    public String getDescription() {
        return "Simple Exception";
    }

    @Override
    public Code code() {
        return Code.ERROR;
    }
}
