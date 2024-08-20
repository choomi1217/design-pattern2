package cho.ym.decorator.myException.exception;

import cho.ym.decorator.myException.Code;

public abstract class MyException {
    public abstract String getDescription();
    public abstract Code code();
}
