import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 class ReadWriteOnFile {

    public static void main(String[] args) {
        String fileName = "javaExam.jsp";
        byte[] dataToWrite = "This is a test for writing and reading bytes in Java.".getBytes();

        // Write bytes to file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(dataToWrite);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read bytes from file
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int byteRead;
            System.out.println("Reading data from file:");
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
            }
            System.out.println("\nData read from file successfully.");
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
