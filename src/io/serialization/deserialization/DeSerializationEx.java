package io.serialization.deserialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
    public static void deSerialization()
    {
        try{
            FileInputStream fileInputStream=new FileInputStream("employee.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Employee employee=(Employee) objectInputStream.readObject();

            System.out.println(employee.getEid());
            System.out.println(employee.getName());
            System.out.println(employee.getEmail());
            System.out.println(employee.getAddress());

        }catch (FileNotFoundException | ClassNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }
}
