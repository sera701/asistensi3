
package prakt3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//public class ParticipantSer implements Serializable{
//    private  String firstName, lastName;
//    private int age;
//    
//    public ParticipantSer(String firstName, String lastName, int age){
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.age=age;
//    }
//    public void printData(){
//        System.out.println("Nama\t" +firstName+ " " +lastName);
//        System.out.println("Usia\t" +age);
//    }
//    
//       //to serializable object and save in a file
//    public void saveObject(ParticipantSer Obj){
//        try {
//            FileOutputStream fos = new FileOutputStream("data.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(Obj);
//            oos.flush();
//            fos.close();
//        }catch(IOException ioe){
//            System.out.println("a problem accured during serialize \n" +ioe.getMessage());
//        }
//    }
//    
//    public void readObject(ParticipantSer Obj){
//        try {
//            FileInputStream fis=new FileInputStream("data.ser");
//            ObjectInputStream ois=new ObjectInputStream(fis);
//            Obj=(ParticipantSer) ois.readObject();
//            Obj
//        } catch (Exception e) {
//        }
//    }
//    
//    public static void main(String[] args) {
//        ParticipantSer is = new ParticipantSer("Salsabila","Firdausi", 20);
//        is.saveObject(is);
//        
//    }
//}
