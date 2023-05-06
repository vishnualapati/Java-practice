package org.example.Important;

import java.io.*;

public class ExmSerialization implements Externalizable {
    private String name;
    private int number;
    transient String address;

    public ExmSerialization(String name, int number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExmSerialization exmSerialization = new ExmSerialization("vishnu", 123, "guntur");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\ser.txt"));
        objectOutputStream.writeObject(exmSerialization);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\ser.txt"));
        ExmSerialization exmSerialization1 = (ExmSerialization) objectInputStream.readObject();
        System.out.println(exmSerialization1.name);
        System.out.println(exmSerialization1.number);
//        System.out.println(exmSerialization1.address); return null
        objectInputStream.close();
    }

    /**
     * @param out the stream to write the object to
     * @throws IOException
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    /**
     * @param in the stream to read data from in order to restore the object
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
