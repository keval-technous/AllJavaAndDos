package io.serialization.deserialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
    public static void serialization()
    {
        try {
            FileOutputStream  fileOutputStream=new FileOutputStream("employee.txt");
            ObjectOutputStream objectOutput=new ObjectOutputStream(fileOutputStream);
            Employee employee=new Employee(101,"jay","jay@gmail.com","ahmedabad");
            objectOutput.writeObject(employee);
            System.out.println("Successfully Object convert into ByteStream");
        }catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }
}
