import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int rollNumber;
    private String name;
    private String address;

    public Student(int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
    }
}

public class Serialization{
    public static void main(String[] args) {
        // Data to be written
        Student student = new Student(1, "Amit Sunar", "Pokhara-29");

        try (FileOutputStream fos = new FileOutputStream("student.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Write the student object to the file
            oos.writeObject(student);

            System.out.println("Student data written to file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
