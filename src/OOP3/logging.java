package OOP3;

import java.util.logging.Logger;

class A{}


public class logging {
    Logger logger = Logger.getLogger("newLoggerName");
    public static void main(String[] args) {
        Logger log = Logger.getLogger(A.class.getName());
        System.out.println(log);
    }
}
