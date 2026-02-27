package main.java.br.com.medium.ca_ErrorHandling;

import java.util.Optional;
class ErrorHandling {
    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException("This is the detail message.");
    }
    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }
    void handleErrorByThrowingAnyCheckedException() throws Exception {
        throw new Exception("This is the detail message.");
    }
    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws Exception {
        throw new Exception(message);
    }
    void handleErrorByThrowingAnyUncheckedException() {
        throw new RuntimeException("This is the detail message.");
    }
    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new RuntimeException(message);
    }
    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("This is the detail message.");
    }
    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }
    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException("This is the detail message.");
    }
    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }
    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            return Optional.of(Integer.parseInt(integer));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}

