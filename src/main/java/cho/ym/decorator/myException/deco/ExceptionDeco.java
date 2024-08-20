package cho.ym.decorator.myException.deco;

import cho.ym.decorator.myException.Code;
import cho.ym.decorator.myException.exception.MyException;

public abstract class ExceptionDeco extends MyException {
    protected int count;
    protected MyException myException;

    public ExceptionDeco() {
        this.count = 0;
        this.myException = null;
    }

    public ExceptionDeco(MyException exception) {
        this.myException = exception;
        this.count = exception instanceof ExceptionDeco ? ((ExceptionDeco) exception).count + 1 : 1;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract Code code();
}

