package main.java.br.com.medium.ca_ErrorHandling;

public class CustomUncheckedException extends RuntimeException {

    CustomUncheckedException() {
        throw new IllegalStateException("This is the detail message.");
    }

    CustomUncheckedException(String message) {
        super(message);
    }

}
