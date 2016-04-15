package com.begentgroup.xmlparser;

/**
 * Created by dongja94 on 2016-02-05.
 */
public class SimpleParseException extends RuntimeException {
    public SimpleParseException() {
        super();
    }

    public SimpleParseException(String message) {
        super(message);
    }

    public SimpleParseException(String message, Throwable cause) {
        super(message,cause);
    }

    public SimpleParseException(Throwable cause) {
        super(cause);
    }
}
