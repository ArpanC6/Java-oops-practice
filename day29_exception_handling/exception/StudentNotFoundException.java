package day29_exception_handling.exception;


public class StudentNotFoundException extends RuntimeException {

    /*
     Used when student data not found
    */

    public StudentNotFoundException(String message) {
        super(message);
    }
}
