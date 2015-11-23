package by.epam.module3.lecture3.wirkingWithFile;

import java.io.*;

/**
 * Created by Siarhei_Chyhir on 11/22/2015.
 */
public class ReadWriteTextFile {
    /**
     * Fetch the entire contents of a text file, and return it in a String.
     *
     * This style of implementation throws all exceptions to the caller.
     *
     * @param aFile is a file which already exists and can be read.
     * @throws IllegalArgumentException if param does not comply.
     * @throws FileNotFoundException if the file does not exist.
     * @throws IOException if problem encountered during read.
     */
    static public String getContents(File aFile) throws FileNotFoundException, IOException{
        if (aFile == null) {
            throw new IllegalArgumentException("File should not be null.");
        }
        if (!aFile.exists()) {
            throw new FileNotFoundException ("File does not exist: " + aFile);
        }
        if (!aFile.isFile()) {
            throw new IllegalArgumentException("Should not be a directory: " + aFile);
        }
        if (!aFile.canRead()) {
            throw new IllegalArgumentException("File cannot be readen: " + aFile);
        }
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
            throws FileNotFoundException, IOException {
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
