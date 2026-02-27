package main.java.br.com.medium.ca_ErrorHandling;

public class CustomCheckedException extends Exception {

    CustomCheckedException() {
        throw new IllegalStateException("This is the detail message.");
    }

    CustomCheckedException(String message) {
        super(message);
    }

}

