package by.epam.module3.lecture3.wirkingWithFile;

import by.epam.module3.lecture3.CustomExceptions.FileTypeException;

import java.io.*;

/**
 * Created by Siarhei_Chyhir on 11/22/2015.
 */
public class IOTextFile {

    static public String getContents(File aFile) throws FileTypeException {
        try {
            processFile(aFile);
            StringBuilder contents = new StringBuilder();

            try {
                BufferedReader input =  new BufferedReader(new FileReader(aFile));
                try {
                    String line = null;
                    while (( line = input.readLine()) != null){
                        contents.append(line);
                        contents.append(System.getProperty("line.separator"));
                    }
                }
                finally {
                    input.close();
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
            return contents.toString();
        } catch (FileTypeException e) {
            processErrorCodes(e);
            return null;
        }
    }

    private static void processErrorCodes(FileTypeException e) throws FileTypeException {
        switch(e.getErrorCode()){
            case "BAD_FILE_TYPE":
                System.out.println("Incorrect file type");
                throw e;
            case "FILE_NOT_FOUND_EXCEPTION":
                System.out.println("File not found");
                throw e;
            case "FILE_CLOSE_EXCEPTION":
                System.out.println("Exception during file close");
                break;
            default:
                System.out.println("Unknown exception " + e.getMessage());
                e.printStackTrace();
        }
    }

    private static void processFile(File file) throws FileTypeException {
        InputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new FileTypeException(e.getMessage(),"FILE_NOT_FOUND_EXCEPTION");
        }finally{
            try {
                if(fis !=null)fis.close();
            } catch (IOException e) {
                throw new FileTypeException(e.getMessage(),"FILE_CLOSE_EXCEPTION");
            }
        }
    }


    /**
     * Change the contents of text file in its entirety, overwriting any
     * existing text.
     *
     * This style of implementation throws all exceptions to the caller.
     *
     * @param aFile is an existing file which can be written to.
     * @throws IllegalArgumentException if param does not comply.
     * @throws FileNotFoundException if the file does not exist.
     * @throws IOException if problem encountered during write.
     */
    static public void setContents(File aFile, String aContents, boolean appending)
            throws IOException {
        if (aFile == null) {
            throw new IllegalArgumentException("File should not be null.");
        }
        if (!aFile.exists()) {
            throw new FileNotFoundException ("File does not exist: " + aFile);
        }
        if (!aFile.isFile()) {
            throw new IllegalArgumentException("Should not be a directory: " + aFile);
        }
        if (!aFile.canWrite()) {
            throw new IllegalArgumentException("File cannot be written: " + aFile);
        }

        Writer output = new BufferedWriter(new FileWriter(aFile, appending));
        try {
            output.write( aContents );
        }
        finally {
            output.close();
        }
    }

}
