package cho.ym.decorator.myException.deco;

import cho.ym.decorator.myException.Code;
import cho.ym.decorator.myException.exception.MyException;

import java.util.stream.IntStream;

public class LoggingExceptionDeco extends ExceptionDeco {

    public LoggingExceptionDeco(MyException exception) {
        this.myException = exception;
        count++;
    }

    @Override
    public String getDescription() {
        StringBuilder tabs = new StringBuilder();
        IntStream.range(0, count).forEach(i -> tabs.append("\t"));
        return myException.getDescription() + "\n" + tabs.toString() + "Logging Exception";
    }

    @Override
    public Code code() {
        return Code.ERROR;
    }
}
