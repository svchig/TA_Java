package by.epam.module3.lecture3.CustomExceptions;

/**
 * Created by Siarhei_Chyhir on 11/28/2015.
 */
public class FileTypeException extends Exception{

    private String errorCode = "Unknown_Exception";

    public FileTypeException(String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return this.errorCode;
    }

}
