package org.example.Important;

import java.io.*;

public class ExampleExternalizable implements Externalizable {
    String name;
    int number;
    String address;
    int marks;
    /**
     * @param out the stream to write the object to
     * @throws IOException
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(number);
        out.writeObject(name);
        out.writeInt(marks);
    }

    /**
     * @param in the stream to read data from in order to restore the object
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        number = in.readInt();
        name = (String) in.readObject();
        marks = in.readInt();
    }

//    enum Gender{
//        MALE, FEMALE
//    }
//
//    Gender gender;

    public ExampleExternalizable() {
        System.out.println("No-Arg constructor...");
    }

    public ExampleExternalizable(String name, int number, String address, int marks) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.marks = marks;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExampleExternalizable exampleExternalizable = new ExampleExternalizable("vishnu", 12, "guntur", 99);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\ser.txt"));
        objectOutputStream.writeObject(exampleExternalizable);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\ser.txt"));
        ExampleExternalizable exmSerialization1 = (ExampleExternalizable) objectInputStream.readObject();
        System.out.println(exmSerialization1.name);
        System.out.println(exmSerialization1.number);

//        System.out.println(exmSerialization1.address); return null
        objectInputStream.close();
    }
}
