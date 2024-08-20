package cho.ym.decorator.myException;

import cho.ym.decorator.myException.deco.AlertingExceptionDeco;
import cho.ym.decorator.myException.deco.LoggingExceptionDeco;
import cho.ym.decorator.myException.exception.SimpleException;
import cho.ym.decorator.myException.exception.MyException;

public class App {

    public static void main(String[] args) {

        MyException exception = new SimpleException();

        // 로그 기능을 추가한 예외
        exception = new LoggingExceptionDeco(exception);

        // 알림 기능을 추가한 예외
        exception = new AlertingExceptionDeco(exception);

        // 실제로 기능을 사용
        System.out.println(exception.getDescription());

    }

}
