package cho.ym.decorator.myException.deco;

import cho.ym.decorator.myException.Code;
import cho.ym.decorator.myException.exception.MyException;

public class AlertingExceptionDeco extends ExceptionDeco {

    public AlertingExceptionDeco(MyException exception) {
        this.myException = exception;
        this.count = exception instanceof ExceptionDeco ? ((ExceptionDeco) exception).count + 1 : 1;
    }

    @Override
    public String getDescription() {
        String tabs = "\t".repeat(count);
        return myException.getDescription() + "\n" + tabs + "Alerting Exception";
    }

    @Override
    public Code code() {
        return Code.ERROR;
    }
}